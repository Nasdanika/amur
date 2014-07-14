package org.nasdanika.amur.provider;

import java.util.List;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public interface IItemPropertyDescriptorsContributingParent {
	
	  /**
	   * @param parent Parent component.
	   * @param child Child component.
	   * @return Property descriptors contributed to the child.
	   */
	  void contributePropertyDescriptors(Object parent, Object child, List<IItemPropertyDescriptor> collector);


}
