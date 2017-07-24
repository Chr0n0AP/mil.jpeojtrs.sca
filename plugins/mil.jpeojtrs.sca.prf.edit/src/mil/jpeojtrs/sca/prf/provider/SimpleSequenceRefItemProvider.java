/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.prf.provider;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Values;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.prf.SimpleSequenceRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSequenceRefItemProvider extends AbstractPropertyRefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSequenceRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuesPropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SimpleSequenceRef_values_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequenceRef_values_feature", "_UI_SimpleSequenceRef_type"),
			PrfPackage.Literals.SIMPLE_SEQUENCE_REF__VALUES, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * @generated NOT
	 * @since 3.0
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		// Use the generated method to create the default descriptor, then replace it with a decorated version that
		// adds additional functionality
		addValuesPropertyDescriptorGen(object);
		final IItemPropertyDescriptor defaultDescriptor = getPropertyDescriptor(object, PrfPackage.Literals.SIMPLE_SEQUENCE_REF__VALUES);
		itemPropertyDescriptors.remove(defaultDescriptor);
		itemPropertyDescriptors.add(new ValuesDecorator(object, defaultDescriptor));
	}

	private class ValuesDecorator extends ItemPropertyDescriptorDecorator {
		private IItemLabelProvider labelProvider = null;

		public ValuesDecorator(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		public Object getPropertyValue(Object thisObject) {
			final List<String> value = ((SimpleSequenceRef) thisObject).getValues().getValue();
			return value.toArray(new String[value.size()]);
		}

		@Override
		public void setPropertyValue(Object thisObject, Object value) {
			// Create a new Values instance with the new values, then defer to the wrapped property descriptor to
			// ensure that the set is able to execute correctly
			final Values values = PrfFactory.eINSTANCE.createValues();
			values.getValue().addAll(Arrays.asList((String[]) value));
			itemPropertyDescriptor.setPropertyValue(thisObject, values);
		}

		@Override
		public IItemLabelProvider getLabelProvider(Object thisObject) {
			if (labelProvider == null) {
				labelProvider = new IItemLabelProvider() {

					@Override
					public String getText(Object object) {
						String[] values = (String[]) object;
						final SimpleSequenceRef simpleSequenceRef = (SimpleSequenceRef) ValuesDecorator.this.object;
						return SimpleSequenceRefItemProvider.getValueText(simpleSequenceRef, Arrays.asList(values));
					}

					@Override
					public Object getImage(Object object) {
						final Values values = ((SimpleSequenceRef) ValuesDecorator.this.object).getValues();
						return itemPropertyDescriptor.getLabelProvider(values).getImage(values);
					}
				};
			}
			return labelProvider;
		}

	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * 	 * This returns SimpleSequenceRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleSequence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String text = super.getText(object);
		if (text != null) {
			return text;
		}

		String label = ((SimpleSequenceRef) object).getRefID();
		return label == null || label.length() == 0 ? getString("_UI_SimpleSequenceRef_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimpleSequenceRef.class)) {
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	protected String getValueText(AbstractPropertyRef< ? > object) {
		SimpleSequenceRef ref = (SimpleSequenceRef) object;
		return getValueText(ref, (ref.getValues() == null) ? null : ref.getValues().getValue());
	}

	public static String getValueText(SimpleSequenceRef ref, List<String> value) {
		SimpleSequence property = ref.getProperty();
		if (property == null) {
			return (value == null) ? "" : value.toString();
		}

		return SimpleSequenceItemProvider.getValueText(property, value);
	}

}
