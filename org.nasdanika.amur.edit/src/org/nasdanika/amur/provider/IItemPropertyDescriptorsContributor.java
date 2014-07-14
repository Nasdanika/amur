package org.nasdanika.amur.provider;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Contributes properties to related object.
 * 
 * @author Pavel
 * 
 */
public interface IItemPropertyDescriptorsContributor {

	/**
	 * 
	 * @param source Source object contributing properties to target. E.g. connection source.
	 * @param target Target object for which source's properties appear as its own. E.g. outbound connection.
	 * @param targetRole Target's role in source, e.g. outboundConnections.
	 * @param collector Collector of features.
	 */
	void contributePropertyDescriptors(
			Object source, 
			Object target,
			EReference targetRole,
			List<IItemPropertyDescriptor> collector);

}
