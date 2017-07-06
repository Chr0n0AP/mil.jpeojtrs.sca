/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.partitioning.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.LoggingConfig;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.Uses;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.SoftPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getComponentProperties <em>Component Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getLoggingConfig <em>Logging Config</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getInterfaceStub <em>Interface Stub</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getImplID <em>Impl ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentInstantiationImpl#getStartOrder <em>Start Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentInstantiationImpl extends EObjectImpl implements ComponentInstantiation {
	/**
	 * The default value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected String usageName = USAGE_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentProperties() <em>Component Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentProperties()
	 * @generated
	 * @ordered
	 */
	protected ComponentProperties componentProperties;
	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected ComponentProperties affinity;
	/**
	 * The cached value of the '{@link #getLoggingConfig() <em>Logging Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @see #getLoggingConfig()
	 * @generated
	 * @ordered
	 */
	protected LoggingConfig loggingConfig;
	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPortStub> provides;
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesPortStub> uses;
	/**
	 * The cached value of the '{@link #getInterfaceStub() <em>Interface Stub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceStub()
	 * @generated
	 * @ordered
	 */
	protected ComponentSupportedInterfaceStub interfaceStub;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplID() <em>Impl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @see #getImplID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImplID() <em>Impl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @see #getImplID()
	 * @generated
	 * @ordered
	 */
	protected String implID = IMPL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartOrder() <em>Start Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getStartOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_ORDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartOrder() <em>Start Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getStartOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startOrder = START_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.COMPONENT_INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsageName() {
		return usageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageName(String newUsageName) {
		String oldUsageName = usageName;
		usageName = newUsageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME, oldUsageName, usageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProperties getComponentProperties() {
		return componentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentProperties(ComponentProperties newComponentProperties, NotificationChain msgs) {
		ComponentProperties oldComponentProperties = componentProperties;
		componentProperties = newComponentProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES,
				oldComponentProperties, newComponentProperties);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentProperties(ComponentProperties newComponentProperties) {
		if (newComponentProperties != componentProperties) {
			NotificationChain msgs = null;
			if (componentProperties != null)
				msgs = ((InternalEObject) componentProperties).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES, null, msgs);
			if (newComponentProperties != null)
				msgs = ((InternalEObject) newComponentProperties).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES, null, msgs);
			msgs = basicSetComponentProperties(newComponentProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES, newComponentProperties,
				newComponentProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentProperties getAffinity() {
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffinity(ComponentProperties newAffinity, NotificationChain msgs) {
		ComponentProperties oldAffinity = affinity;
		affinity = newAffinity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY, oldAffinity,
				newAffinity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity(ComponentProperties newAffinity) {
		if (newAffinity != affinity) {
			NotificationChain msgs = null;
			if (affinity != null)
				msgs = ((InternalEObject) affinity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY, null,
					msgs);
			if (newAffinity != null)
				msgs = ((InternalEObject) newAffinity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY, null,
					msgs);
			msgs = basicSetAffinity(newAffinity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY, newAffinity, newAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfig getLoggingConfig() {
		return loggingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoggingConfig(LoggingConfig newLoggingConfig, NotificationChain msgs) {
		LoggingConfig oldLoggingConfig = loggingConfig;
		loggingConfig = newLoggingConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG,
				oldLoggingConfig, newLoggingConfig);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggingConfig(LoggingConfig newLoggingConfig) {
		if (newLoggingConfig != loggingConfig) {
			NotificationChain msgs = null;
			if (loggingConfig != null)
				msgs = ((InternalEObject) loggingConfig).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG, null, msgs);
			if (newLoggingConfig != null)
				msgs = ((InternalEObject) newLoggingConfig).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG, null, msgs);
			msgs = basicSetLoggingConfig(newLoggingConfig, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(
				new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG, newLoggingConfig, newLoggingConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidesPortStub> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<ProvidesPortStub>(ProvidesPortStub.class, this, PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsesPortStub> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<UsesPortStub>(UsesPortStub.class, this, PartitioningPackage.COMPONENT_INSTANTIATION__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSupportedInterfaceStub getInterfaceStub() {
		return interfaceStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceStub(ComponentSupportedInterfaceStub newInterfaceStub, NotificationChain msgs) {
		ComponentSupportedInterfaceStub oldInterfaceStub = interfaceStub;
		interfaceStub = newInterfaceStub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB,
				oldInterfaceStub, newInterfaceStub);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceStub(ComponentSupportedInterfaceStub newInterfaceStub) {
		if (newInterfaceStub != interfaceStub) {
			NotificationChain msgs = null;
			if (interfaceStub != null)
				msgs = ((InternalEObject) interfaceStub).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB, null, msgs);
			if (newInterfaceStub != null)
				msgs = ((InternalEObject) newInterfaceStub).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB, null, msgs);
			msgs = basicSetInterfaceStub(newInterfaceStub, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(
				new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB, newInterfaceStub, newInterfaceStub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPlacement< ? > getPlacement() {
		if (eContainerFeatureID() != PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT)
			return null;
		return (ComponentPlacement< ? >) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacement(ComponentPlacement< ? > newPlacement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPlacement, PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacement(ComponentPlacement< ? > newPlacement) {
		if (newPlacement != eInternalContainer() || (eContainerFeatureID() != PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT && newPlacement != null)) {
			if (EcoreUtil.isAncestor(this, newPlacement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlacement != null)
				msgs = ((InternalEObject) newPlacement).eInverseAdd(this, PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION,
					ComponentPlacement.class, msgs);
			msgs = basicSetPlacement(newPlacement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT, newPlacement, newPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplID() {
		return implID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplID(String newImplID) {
		String oldImplID = implID;
		implID = newImplID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID, oldImplID, implID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartOrder() {
		return startOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.2
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOrder(BigInteger newStartOrder) {
		BigInteger oldStartOrder = startOrder;
		startOrder = newStartOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER, oldStartOrder, startOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPlacement((ComponentPlacement< ? >) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
			return basicSetComponentProperties(null, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY:
			return basicSetAffinity(null, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG:
			return basicSetLoggingConfig(null, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES:
			return ((InternalEList< ? >) getProvides()).basicRemove(otherEnd, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__USES:
			return ((InternalEList< ? >) getUses()).basicRemove(otherEnd, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB:
			return basicSetInterfaceStub(null, msgs);
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			return basicSetPlacement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			return eInternalContainer().eInverseRemove(this, PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION, ComponentPlacement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME:
			return getUsageName();
		case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
			return getComponentProperties();
		case PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY:
			return getAffinity();
		case PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG:
			return getLoggingConfig();
		case PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES:
			return getProvides();
		case PartitioningPackage.COMPONENT_INSTANTIATION__USES:
			return getUses();
		case PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB:
			return getInterfaceStub();
		case PartitioningPackage.COMPONENT_INSTANTIATION__ID:
			return getId();
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			return getPlacement();
		case PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID:
			return getImplID();
		case PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER:
			return getStartOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME:
			setUsageName((String) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
			setComponentProperties((ComponentProperties) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY:
			setAffinity((ComponentProperties) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG:
			setLoggingConfig((LoggingConfig) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB:
			setInterfaceStub((ComponentSupportedInterfaceStub) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__ID:
			setId((String) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			setPlacement((ComponentPlacement< ? >) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID:
			setImplID((String) newValue);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER:
			setStartOrder((BigInteger) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME:
			setUsageName(USAGE_NAME_EDEFAULT);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
			setComponentProperties((ComponentProperties) null);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY:
			setAffinity((ComponentProperties) null);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG:
			setLoggingConfig((LoggingConfig) null);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB:
			setInterfaceStub((ComponentSupportedInterfaceStub) null);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__ID:
			setId(ID_EDEFAULT);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			setPlacement((ComponentPlacement< ? >) null);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID:
			setImplID(IMPL_ID_EDEFAULT);
			return;
		case PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER:
			setStartOrder(START_ORDER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_INSTANTIATION__USAGE_NAME:
			return USAGE_NAME_EDEFAULT == null ? usageName != null : !USAGE_NAME_EDEFAULT.equals(usageName);
		case PartitioningPackage.COMPONENT_INSTANTIATION__COMPONENT_PROPERTIES:
			return componentProperties != null;
		case PartitioningPackage.COMPONENT_INSTANTIATION__AFFINITY:
			return affinity != null;
		case PartitioningPackage.COMPONENT_INSTANTIATION__LOGGING_CONFIG:
			return loggingConfig != null;
		case PartitioningPackage.COMPONENT_INSTANTIATION__PROVIDES:
			return provides != null && !provides.isEmpty();
		case PartitioningPackage.COMPONENT_INSTANTIATION__USES:
			return uses != null && !uses.isEmpty();
		case PartitioningPackage.COMPONENT_INSTANTIATION__INTERFACE_STUB:
			return interfaceStub != null;
		case PartitioningPackage.COMPONENT_INSTANTIATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
			return getPlacement() != null;
		case PartitioningPackage.COMPONENT_INSTANTIATION__IMPL_ID:
			return IMPL_ID_EDEFAULT == null ? implID != null : !IMPL_ID_EDEFAULT.equals(implID);
		case PartitioningPackage.COMPONENT_INSTANTIATION__START_ORDER:
			return START_ORDER_EDEFAULT == null ? startOrder != null : !START_ORDER_EDEFAULT.equals(startOrder);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (usageName: ");
		result.append(usageName);
		result.append(", id: ");
		result.append(id);
		result.append(", implID: ");
		result.append(implID);
		result.append(", startOrder: ");
		result.append(startOrder);
		result.append(')');
		return result.toString();
	}

	private class PlacementAdapter extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			switch (msg.getFeatureID(ComponentPlacement.class)) {
			case PartitioningPackage.COMPONENT_PLACEMENT__COMPONENT_FILE_REF:
				refreshPorts();
				break;
			default:
				break;
			}
		}
	};

	private final Adapter adapter = new AdapterImpl() {
		private PlacementAdapter placementAdapter = new PlacementAdapter();

		@Override
		public void notifyChanged(final Notification msg) {
			switch (msg.getFeatureID(ComponentInstantiation.class)) {
			case PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT:
				if (placementAdapter != null && msg.getOldValue() instanceof ComponentPlacement< ? >) {
					((ComponentPlacement< ? >) msg.getOldValue()).eAdapters().remove(placementAdapter);
				}
				refreshPorts();
				if (msg.getNewValue() instanceof ComponentPlacement) {
					((ComponentPlacement< ? >) msg.getNewValue()).eAdapters().add(placementAdapter);
				}
				break;
			default:
				break;
			}
		}
	};

	{
		eAdapters().add(this.adapter);
	}

	private void refreshPorts() {
		final ComponentFeatures features = getComponentFeatures();
		this.getUses().clear();
		this.getProvides().clear();

		if (features != null) {
			final Ports ports = features.getPorts();
			if (ports != null) {
				for (final Provides provides : ports.getProvides()) {
					final ProvidesPortStub stub = createProvidesPortStub();
					stub.setProvides(provides);
					this.getProvides().add(stub);
				}
				for (final Uses uses : ports.getUses()) {
					final UsesPortStub stub = createUsesPortStub();
					stub.setUses(uses);
					this.getUses().add(stub);
				}
			}

			if (!features.getSupportsInterface().isEmpty()) {
				setInterfaceStub(PartitioningFactory.eINSTANCE.createComponentSupportedInterfaceStub());
			} else {
				setInterfaceStub(null);
			}
		} else {
			setInterfaceStub(PartitioningFactory.eINSTANCE.createComponentSupportedInterfaceStub());
		}
	}

	protected ProvidesPortStub createProvidesPortStub() {
		return new ProvidesPortStubImpl();
	}

	protected UsesPortStub createUsesPortStub() {
		return new UsesPortStubImpl();
	}

	private ComponentFeatures getComponentFeatures() {
		// END GENERATED CODE
		final ComponentPlacement< ? > placement = this.getPlacement();
		if (placement == null) {
			return null;
		}
		final ComponentFileRef fileRef = placement.getComponentFileRef();
		if (fileRef == null) {
			return null;
		}
		final ComponentFile refId = fileRef.getFile();
		if (refId == null) {
			return null;
		}
		final SoftPkg softPkg = refId.getSoftPkg();
		if (softPkg == null) {
			return null;
		}
		final Descriptor descriptor = softPkg.getDescriptor();
		if (descriptor == null) {
			return null;
		}
		final SoftwareComponent component = descriptor.getComponent();
		if (component == null) {
			return null;
		}
		final ComponentFeatures componentFeatures = component.getComponentFeatures();
		return componentFeatures;
		// BEGIN GENERATED CODE
	}

} //ComponentInstantiationImpl
