package org.nasdanika.amur.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Utility class.
 * @author Pavel Vlasov
 *
 */
public final class AmurUtil {
	
	private AmurUtil() { 
		throw new UnsupportedOperationException(); 
	}
	
	/**
	 * Allows to filter features being pumped.
	 * @author Pavel Vlasov
	 *
	 */
	public interface FeatureFilter {
		
		boolean acceptFeature(EStructuralFeature feature);
	}
	
	/**
	 * Filters out features which are declared in the provided EClass or its superclasses.
	 * @author Pavel Vlasov
	 */
	public static class SuperClassFeatureFilter implements FeatureFilter {
		
		private EClass eClass;

		public SuperClassFeatureFilter(EClass eClass) {
			this.eClass = eClass;
		}

		@Override
		public boolean acceptFeature(EStructuralFeature feature) {
			return !feature.getEContainingClass().isSuperTypeOf(eClass);
		}
		
	}
	
	/**
	 * This method copies or "moves", i.e. copies and unsets features (attributes and references) which are common between source and target 
	 * from source object to the target object.
	 * @param source Source object.
	 * @param target Target object.
	 * @param force If true, feature is copied even if the target feature is set.
	 * @param unset If true, copied feature is unset in the source object.
	 * @param Feature filters allow to exclude specific features, e.g. name, id, ...
	 */
	public static void pumpFeatures(EObject source, EObject target, boolean force, boolean unset, FeatureFilter... featureFilters) {
		if (source!=null && target!=null) {
			Z: for (EStructuralFeature sourceFeature: source.eClass().getEAllStructuralFeatures()) {
				for (FeatureFilter ff: featureFilters) {
					if (!ff.acceptFeature(sourceFeature)) {
						continue Z;
					}
				}
				for (EStructuralFeature targetFeature: target.eClass().getEAllStructuralFeatures()) {
					if (sourceFeature.equals(targetFeature) || (sourceFeature.getEContainingClass().equals(targetFeature.getEContainingClass()) && sourceFeature.getName().equals(targetFeature.getName()))) {
						if (source.eIsSet(sourceFeature)) {
							if (force || !target.eIsSet(targetFeature)) {
								target.eSet(targetFeature, source.eGet(sourceFeature));
								if (unset) {
									source.eUnset(sourceFeature);
								}
							}
						}
					}
				}
			}
		}
	}

}
