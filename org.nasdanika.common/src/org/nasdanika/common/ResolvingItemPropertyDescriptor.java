package org.nasdanika.common;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Item property descriptor which resolves actual property property owner, e.g. child object, from the argument object.
 * @author Pavel Vlasov
 *
 */
public abstract class ResolvingItemPropertyDescriptor implements IItemPropertyDescriptor {
	
	protected IItemPropertyDescriptor master;
	
	/**
	 * Resolves property target. This implementation does nothing - simply returns the argument.
	 * @param obj
	 * @return
	 */
	protected Object resolve(Object obj) {
		return obj;
	}

	public ResolvingItemPropertyDescriptor(IItemPropertyDescriptor master) {
		this.master = master;
	}

	public Object getPropertyValue(Object object) {
		return master.getPropertyValue(resolve(object));
	}

	public boolean isPropertySet(Object object) {
		return master.isPropertySet(resolve(object));
	}

	public boolean canSetProperty(Object object) {
		return master.canSetProperty(resolve(object));
	}

	public void resetPropertyValue(Object object) {
		master.resetPropertyValue(resolve(object));
	}

	public void setPropertyValue(Object object, Object value) {
		master.setPropertyValue(resolve(object), value);
	}

	public String getCategory(Object object) {
		return master.getCategory(resolve(object));
	}

	public String getDescription(Object object) {
		return master.getDescription(resolve(object));
	}

	public String getDisplayName(Object object) {
		return master.getDisplayName(resolve(object));
	}

	public String[] getFilterFlags(Object object) {
		return master.getFilterFlags(resolve(object));
	}

	public Object getHelpContextIds(Object object) {
		return master.getHelpContextIds(resolve(object));
	}

	public String getId(Object object) {
		return master.getId(resolve(object));
	}

	public IItemLabelProvider getLabelProvider(Object object) {
		return master.getLabelProvider(resolve(object));
	}

	public boolean isCompatibleWith(Object object, Object anotherObject, IItemPropertyDescriptor anotherPropertyDescriptor) {
		return master.isCompatibleWith(resolve(object), resolve(anotherObject), anotherPropertyDescriptor);
	}

	public Object getFeature(Object object) {
		return master.getFeature(resolve(object));
	}

	public boolean isMany(Object object) {
		return master.isMany(resolve(object));
	}

	public Collection<?> getChoiceOfValues(Object object) {
		return master.getChoiceOfValues(resolve(object));
	}

	public boolean isMultiLine(Object object) {
		return master.isMultiLine(resolve(object));
	}

	public boolean isSortChoices(Object object) {
		return master.isSortChoices(resolve(object));
	}

}
