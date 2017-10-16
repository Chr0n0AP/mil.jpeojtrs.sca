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
package mil.jpeojtrs.sca.dcd.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.provider.ComponentInstantiationItemProvider;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.dcd.DcdComponentInstantiation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DcdComponentInstantiationItemProvider extends ComponentInstantiationItemProvider {

	private static final EStructuralFeature[] COMP_INST_TO_SCD_PATH = new EStructuralFeature[] {
		PartitioningPackage.Literals.COMPONENT_INSTANTIATION__PLACEMENT, PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF,
		PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE, PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG, SpdPackage.Literals.SOFT_PKG__DESCRIPTOR,
		SpdPackage.Literals.DESCRIPTOR__COMPONENT };

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdComponentInstantiationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This returns the image for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		if (object instanceof DcdComponentInstantiation) {
			DcdComponentInstantiation compInst = (DcdComponentInstantiation) object;
			SoftwareComponent scd = ScaEcoreUtils.getFeature(compInst, COMP_INST_TO_SCD_PATH);
			switch (SoftwareComponent.Util.getWellKnownComponentType(scd)) {
			case DEVICE:
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Device"));
			case SERVICE:
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Service"));
			default:
				break;
			}
		}
		return super.getImage(object);
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

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection< ? > selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == PartitioningPackage.Literals.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES
			|| childFeature == PartitioningPackage.Literals.COMPONENT_INSTANTIATION__AFFINITY;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DcdEditPlugin.INSTANCE;
	}

}
