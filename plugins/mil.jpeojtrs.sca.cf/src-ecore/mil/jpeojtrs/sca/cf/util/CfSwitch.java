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
package mil.jpeojtrs.sca.cf.util;

import mil.jpeojtrs.sca.cf.CfPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.omg.CORBA.portable.IDLEntity;
import CF.AggregateDevice;
import CF.AggregateDeviceOperations;
import CF.AggregateExecutableDevice;
import CF.AggregateExecutableDeviceOperations;
import CF.AggregateLoadableDevice;
import CF.AggregateLoadableDeviceOperations;
import CF.AggregatePlainDevice;
import CF.AggregatePlainDeviceOperations;
import CF.AllocationManager;
import CF.AllocationManagerOperations;
import CF.Application;
import CF.ApplicationFactory;
import CF.ApplicationFactoryOperations;
import CF.ApplicationOperations;
import CF.Device;
import CF.DeviceManager;
import CF.DeviceManagerOperations;
import CF.DeviceOperations;
import CF.DomainManager;
import CF.DomainManagerOperations;
import CF.EventChannelManager;
import CF.EventChannelManagerOperations;
import CF.ExecutableDevice;
import CF.ExecutableDeviceOperations;
import CF.File;
import CF.FileManager;
import CF.FileManagerOperations;
import CF.FileOperations;
import CF.FileSystem;
import CF.FileSystemOperations;
import CF.LifeCycle;
import CF.LifeCycleOperations;
import CF.LoadableDevice;
import CF.LoadableDeviceOperations;
import CF.LogConfiguration;
import CF.LogConfigurationOperations;
import CF.LogEventConsumer;
import CF.LogEventConsumerOperations;
import CF.Logging;
import CF.LoggingOperations;
import CF.Port;
import CF.PortOperations;
import CF.PortSet;
import CF.PortSetOperations;
import CF.PortSupplier;
import CF.PortSupplierOperations;
import CF.PropertyEmitter;
import CF.PropertyEmitterOperations;
import CF.PropertySet;
import CF.PropertySetOperations;
import CF.Resource;
import CF.ResourceFactory;
import CF.ResourceFactoryOperations;
import CF.ResourceOperations;
import CF.TestableObject;
import CF.TestableObjectOperations;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.cf.CfPackage
 * @generated
 */
public class CfSwitch< T > extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfSwitch() {
		if (modelPackage == null) {
			modelPackage = CfPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CfPackage.AGGREGATE_DEVICE: {
			AggregateDevice aggregateDevice = (AggregateDevice) theEObject;
			T result = caseAggregateDevice(aggregateDevice);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregateDevice);
			if (result == null)
				result = caseObject(aggregateDevice);
			if (result == null)
				result = caseIDLEntity(aggregateDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_DEVICE_OPERATIONS: {
			AggregateDeviceOperations aggregateDeviceOperations = (AggregateDeviceOperations) theEObject;
			T result = caseAggregateDeviceOperations(aggregateDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_EXECUTABLE_DEVICE: {
			AggregateExecutableDevice aggregateExecutableDevice = (AggregateExecutableDevice) theEObject;
			T result = caseAggregateExecutableDevice(aggregateExecutableDevice);
			if (result == null)
				result = caseAggregateExecutableDeviceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseExecutableDevice(aggregateExecutableDevice);
			if (result == null)
				result = caseAggregateDevice(aggregateExecutableDevice);
			if (result == null)
				result = caseExecutableDeviceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseLoadableDevice(aggregateExecutableDevice);
			if (result == null)
				result = caseLoadableDeviceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseDevice(aggregateExecutableDevice);
			if (result == null)
				result = caseDeviceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseResource(aggregateExecutableDevice);
			if (result == null)
				result = caseResourceOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseLifeCycle(aggregateExecutableDevice);
			if (result == null)
				result = caseTestableObject(aggregateExecutableDevice);
			if (result == null)
				result = casePropertyEmitter(aggregateExecutableDevice);
			if (result == null)
				result = casePortSet(aggregateExecutableDevice);
			if (result == null)
				result = caseLogging(aggregateExecutableDevice);
			if (result == null)
				result = caseLifeCycleOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseTestableObjectOperations(aggregateExecutableDevice);
			if (result == null)
				result = casePropertyEmitterOperations(aggregateExecutableDevice);
			if (result == null)
				result = casePortSetOperations(aggregateExecutableDevice);
			if (result == null)
				result = casePortSupplier(aggregateExecutableDevice);
			if (result == null)
				result = caseLoggingOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseLogEventConsumer(aggregateExecutableDevice);
			if (result == null)
				result = caseLogConfiguration(aggregateExecutableDevice);
			if (result == null)
				result = casePropertySetOperations(aggregateExecutableDevice);
			if (result == null)
				result = casePortSupplierOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseObject(aggregateExecutableDevice);
			if (result == null)
				result = caseIDLEntity(aggregateExecutableDevice);
			if (result == null)
				result = caseLogEventConsumerOperations(aggregateExecutableDevice);
			if (result == null)
				result = caseLogConfigurationOperations(aggregateExecutableDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_EXECUTABLE_DEVICE_OPERATIONS: {
			AggregateExecutableDeviceOperations aggregateExecutableDeviceOperations = (AggregateExecutableDeviceOperations) theEObject;
			T result = caseAggregateExecutableDeviceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseExecutableDeviceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseLoadableDeviceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseDeviceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseResourceOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = casePortSupplierOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = casePropertySetOperations(aggregateExecutableDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_LOADABLE_DEVICE: {
			AggregateLoadableDevice aggregateLoadableDevice = (AggregateLoadableDevice) theEObject;
			T result = caseAggregateLoadableDevice(aggregateLoadableDevice);
			if (result == null)
				result = caseAggregateLoadableDeviceOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseLoadableDevice(aggregateLoadableDevice);
			if (result == null)
				result = caseAggregateDevice(aggregateLoadableDevice);
			if (result == null)
				result = caseLoadableDeviceOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseDevice(aggregateLoadableDevice);
			if (result == null)
				result = caseDeviceOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseResource(aggregateLoadableDevice);
			if (result == null)
				result = caseResourceOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseLifeCycle(aggregateLoadableDevice);
			if (result == null)
				result = caseTestableObject(aggregateLoadableDevice);
			if (result == null)
				result = casePropertyEmitter(aggregateLoadableDevice);
			if (result == null)
				result = casePortSet(aggregateLoadableDevice);
			if (result == null)
				result = caseLogging(aggregateLoadableDevice);
			if (result == null)
				result = caseLifeCycleOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseTestableObjectOperations(aggregateLoadableDevice);
			if (result == null)
				result = casePropertyEmitterOperations(aggregateLoadableDevice);
			if (result == null)
				result = casePortSetOperations(aggregateLoadableDevice);
			if (result == null)
				result = casePortSupplier(aggregateLoadableDevice);
			if (result == null)
				result = caseLoggingOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseLogEventConsumer(aggregateLoadableDevice);
			if (result == null)
				result = caseLogConfiguration(aggregateLoadableDevice);
			if (result == null)
				result = casePropertySetOperations(aggregateLoadableDevice);
			if (result == null)
				result = casePortSupplierOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseObject(aggregateLoadableDevice);
			if (result == null)
				result = caseIDLEntity(aggregateLoadableDevice);
			if (result == null)
				result = caseLogEventConsumerOperations(aggregateLoadableDevice);
			if (result == null)
				result = caseLogConfigurationOperations(aggregateLoadableDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_LOADABLE_DEVICE_OPERATIONS: {
			AggregateLoadableDeviceOperations aggregateLoadableDeviceOperations = (AggregateLoadableDeviceOperations) theEObject;
			T result = caseAggregateLoadableDeviceOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseLoadableDeviceOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseDeviceOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseResourceOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = casePortSupplierOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = casePropertySetOperations(aggregateLoadableDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_PLAIN_DEVICE: {
			AggregatePlainDevice aggregatePlainDevice = (AggregatePlainDevice) theEObject;
			T result = caseAggregatePlainDevice(aggregatePlainDevice);
			if (result == null)
				result = caseAggregatePlainDeviceOperations(aggregatePlainDevice);
			if (result == null)
				result = caseDevice(aggregatePlainDevice);
			if (result == null)
				result = caseAggregateDevice(aggregatePlainDevice);
			if (result == null)
				result = caseDeviceOperations(aggregatePlainDevice);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregatePlainDevice);
			if (result == null)
				result = caseResource(aggregatePlainDevice);
			if (result == null)
				result = caseResourceOperations(aggregatePlainDevice);
			if (result == null)
				result = caseLifeCycle(aggregatePlainDevice);
			if (result == null)
				result = caseTestableObject(aggregatePlainDevice);
			if (result == null)
				result = casePropertyEmitter(aggregatePlainDevice);
			if (result == null)
				result = casePortSet(aggregatePlainDevice);
			if (result == null)
				result = caseLogging(aggregatePlainDevice);
			if (result == null)
				result = caseLifeCycleOperations(aggregatePlainDevice);
			if (result == null)
				result = caseTestableObjectOperations(aggregatePlainDevice);
			if (result == null)
				result = casePropertyEmitterOperations(aggregatePlainDevice);
			if (result == null)
				result = casePortSetOperations(aggregatePlainDevice);
			if (result == null)
				result = casePortSupplier(aggregatePlainDevice);
			if (result == null)
				result = caseLoggingOperations(aggregatePlainDevice);
			if (result == null)
				result = caseLogEventConsumer(aggregatePlainDevice);
			if (result == null)
				result = caseLogConfiguration(aggregatePlainDevice);
			if (result == null)
				result = casePropertySetOperations(aggregatePlainDevice);
			if (result == null)
				result = casePortSupplierOperations(aggregatePlainDevice);
			if (result == null)
				result = caseObject(aggregatePlainDevice);
			if (result == null)
				result = caseIDLEntity(aggregatePlainDevice);
			if (result == null)
				result = caseLogEventConsumerOperations(aggregatePlainDevice);
			if (result == null)
				result = caseLogConfigurationOperations(aggregatePlainDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.AGGREGATE_PLAIN_DEVICE_OPERATIONS: {
			AggregatePlainDeviceOperations aggregatePlainDeviceOperations = (AggregatePlainDeviceOperations) theEObject;
			T result = caseAggregatePlainDeviceOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = caseDeviceOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = caseAggregateDeviceOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = caseResourceOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = casePortSupplierOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = casePropertySetOperations(aggregatePlainDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.ALLOCATION_MANAGER: {
			AllocationManager allocationManager = (AllocationManager) theEObject;
			T result = caseAllocationManager(allocationManager);
			if (result == null)
				result = caseAllocationManagerOperations(allocationManager);
			if (result == null)
				result = caseObject(allocationManager);
			if (result == null)
				result = caseIDLEntity(allocationManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.ALLOCATION_MANAGER_OPERATIONS: {
			AllocationManagerOperations allocationManagerOperations = (AllocationManagerOperations) theEObject;
			T result = caseAllocationManagerOperations(allocationManagerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = caseApplicationOperations(application);
			if (result == null)
				result = caseResource(application);
			if (result == null)
				result = caseResourceOperations(application);
			if (result == null)
				result = caseLifeCycle(application);
			if (result == null)
				result = caseTestableObject(application);
			if (result == null)
				result = casePropertyEmitter(application);
			if (result == null)
				result = casePortSet(application);
			if (result == null)
				result = caseLogging(application);
			if (result == null)
				result = caseLifeCycleOperations(application);
			if (result == null)
				result = caseTestableObjectOperations(application);
			if (result == null)
				result = casePropertyEmitterOperations(application);
			if (result == null)
				result = casePortSetOperations(application);
			if (result == null)
				result = casePortSupplier(application);
			if (result == null)
				result = caseLoggingOperations(application);
			if (result == null)
				result = caseLogEventConsumer(application);
			if (result == null)
				result = caseLogConfiguration(application);
			if (result == null)
				result = casePropertySetOperations(application);
			if (result == null)
				result = casePortSupplierOperations(application);
			if (result == null)
				result = caseObject(application);
			if (result == null)
				result = caseIDLEntity(application);
			if (result == null)
				result = caseLogEventConsumerOperations(application);
			if (result == null)
				result = caseLogConfigurationOperations(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.APPLICATION_FACTORY: {
			ApplicationFactory applicationFactory = (ApplicationFactory) theEObject;
			T result = caseApplicationFactory(applicationFactory);
			if (result == null)
				result = caseApplicationFactoryOperations(applicationFactory);
			if (result == null)
				result = caseObject(applicationFactory);
			if (result == null)
				result = caseIDLEntity(applicationFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.APPLICATION_FACTORY_OPERATIONS: {
			ApplicationFactoryOperations applicationFactoryOperations = (ApplicationFactoryOperations) theEObject;
			T result = caseApplicationFactoryOperations(applicationFactoryOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.APPLICATION_OPERATIONS: {
			ApplicationOperations applicationOperations = (ApplicationOperations) theEObject;
			T result = caseApplicationOperations(applicationOperations);
			if (result == null)
				result = caseResourceOperations(applicationOperations);
			if (result == null)
				result = caseLifeCycleOperations(applicationOperations);
			if (result == null)
				result = caseTestableObjectOperations(applicationOperations);
			if (result == null)
				result = casePropertyEmitterOperations(applicationOperations);
			if (result == null)
				result = casePortSupplierOperations(applicationOperations);
			if (result == null)
				result = casePropertySetOperations(applicationOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DEVICE: {
			Device device = (Device) theEObject;
			T result = caseDevice(device);
			if (result == null)
				result = caseDeviceOperations(device);
			if (result == null)
				result = caseResource(device);
			if (result == null)
				result = caseResourceOperations(device);
			if (result == null)
				result = caseLifeCycle(device);
			if (result == null)
				result = caseTestableObject(device);
			if (result == null)
				result = casePropertyEmitter(device);
			if (result == null)
				result = casePortSet(device);
			if (result == null)
				result = caseLogging(device);
			if (result == null)
				result = caseLifeCycleOperations(device);
			if (result == null)
				result = caseTestableObjectOperations(device);
			if (result == null)
				result = casePropertyEmitterOperations(device);
			if (result == null)
				result = casePortSetOperations(device);
			if (result == null)
				result = casePortSupplier(device);
			if (result == null)
				result = caseLoggingOperations(device);
			if (result == null)
				result = caseLogEventConsumer(device);
			if (result == null)
				result = caseLogConfiguration(device);
			if (result == null)
				result = casePropertySetOperations(device);
			if (result == null)
				result = casePortSupplierOperations(device);
			if (result == null)
				result = caseObject(device);
			if (result == null)
				result = caseIDLEntity(device);
			if (result == null)
				result = caseLogEventConsumerOperations(device);
			if (result == null)
				result = caseLogConfigurationOperations(device);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DEVICE_MANAGER: {
			DeviceManager deviceManager = (DeviceManager) theEObject;
			T result = caseDeviceManager(deviceManager);
			if (result == null)
				result = caseDeviceManagerOperations(deviceManager);
			if (result == null)
				result = casePropertyEmitter(deviceManager);
			if (result == null)
				result = casePortSet(deviceManager);
			if (result == null)
				result = casePropertyEmitterOperations(deviceManager);
			if (result == null)
				result = casePortSetOperations(deviceManager);
			if (result == null)
				result = casePortSupplier(deviceManager);
			if (result == null)
				result = casePropertySetOperations(deviceManager);
			if (result == null)
				result = caseObject(deviceManager);
			if (result == null)
				result = caseIDLEntity(deviceManager);
			if (result == null)
				result = casePortSupplierOperations(deviceManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DEVICE_MANAGER_OPERATIONS: {
			DeviceManagerOperations deviceManagerOperations = (DeviceManagerOperations) theEObject;
			T result = caseDeviceManagerOperations(deviceManagerOperations);
			if (result == null)
				result = casePropertyEmitterOperations(deviceManagerOperations);
			if (result == null)
				result = casePortSetOperations(deviceManagerOperations);
			if (result == null)
				result = casePropertySetOperations(deviceManagerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DEVICE_OPERATIONS: {
			DeviceOperations deviceOperations = (DeviceOperations) theEObject;
			T result = caseDeviceOperations(deviceOperations);
			if (result == null)
				result = caseResourceOperations(deviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(deviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(deviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(deviceOperations);
			if (result == null)
				result = casePortSupplierOperations(deviceOperations);
			if (result == null)
				result = casePropertySetOperations(deviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DOMAIN_MANAGER: {
			DomainManager domainManager = (DomainManager) theEObject;
			T result = caseDomainManager(domainManager);
			if (result == null)
				result = caseDomainManagerOperations(domainManager);
			if (result == null)
				result = casePropertyEmitter(domainManager);
			if (result == null)
				result = casePropertyEmitterOperations(domainManager);
			if (result == null)
				result = caseObject(domainManager);
			if (result == null)
				result = caseIDLEntity(domainManager);
			if (result == null)
				result = casePropertySetOperations(domainManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.DOMAIN_MANAGER_OPERATIONS: {
			DomainManagerOperations domainManagerOperations = (DomainManagerOperations) theEObject;
			T result = caseDomainManagerOperations(domainManagerOperations);
			if (result == null)
				result = casePropertyEmitterOperations(domainManagerOperations);
			if (result == null)
				result = casePropertySetOperations(domainManagerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.EVENT_CHANNEL_MANAGER: {
			EventChannelManager eventChannelManager = (EventChannelManager) theEObject;
			T result = caseEventChannelManager(eventChannelManager);
			if (result == null)
				result = caseEventChannelManagerOperations(eventChannelManager);
			if (result == null)
				result = caseObject(eventChannelManager);
			if (result == null)
				result = caseIDLEntity(eventChannelManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.EVENT_CHANNEL_MANAGER_OPERATIONS: {
			EventChannelManagerOperations eventChannelManagerOperations = (EventChannelManagerOperations) theEObject;
			T result = caseEventChannelManagerOperations(eventChannelManagerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.EXECUTABLE_DEVICE: {
			ExecutableDevice executableDevice = (ExecutableDevice) theEObject;
			T result = caseExecutableDevice(executableDevice);
			if (result == null)
				result = caseExecutableDeviceOperations(executableDevice);
			if (result == null)
				result = caseLoadableDevice(executableDevice);
			if (result == null)
				result = caseLoadableDeviceOperations(executableDevice);
			if (result == null)
				result = caseDevice(executableDevice);
			if (result == null)
				result = caseDeviceOperations(executableDevice);
			if (result == null)
				result = caseResource(executableDevice);
			if (result == null)
				result = caseResourceOperations(executableDevice);
			if (result == null)
				result = caseLifeCycle(executableDevice);
			if (result == null)
				result = caseTestableObject(executableDevice);
			if (result == null)
				result = casePropertyEmitter(executableDevice);
			if (result == null)
				result = casePortSet(executableDevice);
			if (result == null)
				result = caseLogging(executableDevice);
			if (result == null)
				result = caseLifeCycleOperations(executableDevice);
			if (result == null)
				result = caseTestableObjectOperations(executableDevice);
			if (result == null)
				result = casePropertyEmitterOperations(executableDevice);
			if (result == null)
				result = casePortSetOperations(executableDevice);
			if (result == null)
				result = casePortSupplier(executableDevice);
			if (result == null)
				result = caseLoggingOperations(executableDevice);
			if (result == null)
				result = caseLogEventConsumer(executableDevice);
			if (result == null)
				result = caseLogConfiguration(executableDevice);
			if (result == null)
				result = casePropertySetOperations(executableDevice);
			if (result == null)
				result = casePortSupplierOperations(executableDevice);
			if (result == null)
				result = caseObject(executableDevice);
			if (result == null)
				result = caseIDLEntity(executableDevice);
			if (result == null)
				result = caseLogEventConsumerOperations(executableDevice);
			if (result == null)
				result = caseLogConfigurationOperations(executableDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.EXECUTABLE_DEVICE_OPERATIONS: {
			ExecutableDeviceOperations executableDeviceOperations = (ExecutableDeviceOperations) theEObject;
			T result = caseExecutableDeviceOperations(executableDeviceOperations);
			if (result == null)
				result = caseLoadableDeviceOperations(executableDeviceOperations);
			if (result == null)
				result = caseDeviceOperations(executableDeviceOperations);
			if (result == null)
				result = caseResourceOperations(executableDeviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(executableDeviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(executableDeviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(executableDeviceOperations);
			if (result == null)
				result = casePortSupplierOperations(executableDeviceOperations);
			if (result == null)
				result = casePropertySetOperations(executableDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE: {
			File file = (File) theEObject;
			T result = caseFile(file);
			if (result == null)
				result = caseFileOperations(file);
			if (result == null)
				result = caseObject(file);
			if (result == null)
				result = caseIDLEntity(file);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE_MANAGER: {
			FileManager fileManager = (FileManager) theEObject;
			T result = caseFileManager(fileManager);
			if (result == null)
				result = caseFileManagerOperations(fileManager);
			if (result == null)
				result = caseFileSystem(fileManager);
			if (result == null)
				result = caseFileSystemOperations(fileManager);
			if (result == null)
				result = caseObject(fileManager);
			if (result == null)
				result = caseIDLEntity(fileManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE_MANAGER_OPERATIONS: {
			FileManagerOperations fileManagerOperations = (FileManagerOperations) theEObject;
			T result = caseFileManagerOperations(fileManagerOperations);
			if (result == null)
				result = caseFileSystemOperations(fileManagerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE_OPERATIONS: {
			FileOperations fileOperations = (FileOperations) theEObject;
			T result = caseFileOperations(fileOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE_SYSTEM: {
			FileSystem fileSystem = (FileSystem) theEObject;
			T result = caseFileSystem(fileSystem);
			if (result == null)
				result = caseFileSystemOperations(fileSystem);
			if (result == null)
				result = caseObject(fileSystem);
			if (result == null)
				result = caseIDLEntity(fileSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.FILE_SYSTEM_OPERATIONS: {
			FileSystemOperations fileSystemOperations = (FileSystemOperations) theEObject;
			T result = caseFileSystemOperations(fileSystemOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.IDL_ENTITY: {
			IDLEntity idlEntity = (IDLEntity) theEObject;
			T result = caseIDLEntity(idlEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LIFE_CYCLE: {
			LifeCycle lifeCycle = (LifeCycle) theEObject;
			T result = caseLifeCycle(lifeCycle);
			if (result == null)
				result = caseLifeCycleOperations(lifeCycle);
			if (result == null)
				result = caseObject(lifeCycle);
			if (result == null)
				result = caseIDLEntity(lifeCycle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LIFE_CYCLE_OPERATIONS: {
			LifeCycleOperations lifeCycleOperations = (LifeCycleOperations) theEObject;
			T result = caseLifeCycleOperations(lifeCycleOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOADABLE_DEVICE: {
			LoadableDevice loadableDevice = (LoadableDevice) theEObject;
			T result = caseLoadableDevice(loadableDevice);
			if (result == null)
				result = caseLoadableDeviceOperations(loadableDevice);
			if (result == null)
				result = caseDevice(loadableDevice);
			if (result == null)
				result = caseDeviceOperations(loadableDevice);
			if (result == null)
				result = caseResource(loadableDevice);
			if (result == null)
				result = caseResourceOperations(loadableDevice);
			if (result == null)
				result = caseLifeCycle(loadableDevice);
			if (result == null)
				result = caseTestableObject(loadableDevice);
			if (result == null)
				result = casePropertyEmitter(loadableDevice);
			if (result == null)
				result = casePortSet(loadableDevice);
			if (result == null)
				result = caseLogging(loadableDevice);
			if (result == null)
				result = caseLifeCycleOperations(loadableDevice);
			if (result == null)
				result = caseTestableObjectOperations(loadableDevice);
			if (result == null)
				result = casePropertyEmitterOperations(loadableDevice);
			if (result == null)
				result = casePortSetOperations(loadableDevice);
			if (result == null)
				result = casePortSupplier(loadableDevice);
			if (result == null)
				result = caseLoggingOperations(loadableDevice);
			if (result == null)
				result = caseLogEventConsumer(loadableDevice);
			if (result == null)
				result = caseLogConfiguration(loadableDevice);
			if (result == null)
				result = casePropertySetOperations(loadableDevice);
			if (result == null)
				result = casePortSupplierOperations(loadableDevice);
			if (result == null)
				result = caseObject(loadableDevice);
			if (result == null)
				result = caseIDLEntity(loadableDevice);
			if (result == null)
				result = caseLogEventConsumerOperations(loadableDevice);
			if (result == null)
				result = caseLogConfigurationOperations(loadableDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOADABLE_DEVICE_OPERATIONS: {
			LoadableDeviceOperations loadableDeviceOperations = (LoadableDeviceOperations) theEObject;
			T result = caseLoadableDeviceOperations(loadableDeviceOperations);
			if (result == null)
				result = caseDeviceOperations(loadableDeviceOperations);
			if (result == null)
				result = caseResourceOperations(loadableDeviceOperations);
			if (result == null)
				result = caseLifeCycleOperations(loadableDeviceOperations);
			if (result == null)
				result = caseTestableObjectOperations(loadableDeviceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(loadableDeviceOperations);
			if (result == null)
				result = casePortSupplierOperations(loadableDeviceOperations);
			if (result == null)
				result = casePropertySetOperations(loadableDeviceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOGGING: {
			Logging logging = (Logging) theEObject;
			T result = caseLogging(logging);
			if (result == null)
				result = caseLoggingOperations(logging);
			if (result == null)
				result = caseLogEventConsumer(logging);
			if (result == null)
				result = caseLogConfiguration(logging);
			if (result == null)
				result = caseLogEventConsumerOperations(logging);
			if (result == null)
				result = caseLogConfigurationOperations(logging);
			if (result == null)
				result = caseObject(logging);
			if (result == null)
				result = caseIDLEntity(logging);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOGGING_OPERATIONS: {
			LoggingOperations loggingOperations = (LoggingOperations) theEObject;
			T result = caseLoggingOperations(loggingOperations);
			if (result == null)
				result = caseLogEventConsumerOperations(loggingOperations);
			if (result == null)
				result = caseLogConfigurationOperations(loggingOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOG_EVENT_CONSUMER: {
			LogEventConsumer logEventConsumer = (LogEventConsumer) theEObject;
			T result = caseLogEventConsumer(logEventConsumer);
			if (result == null)
				result = caseLogEventConsumerOperations(logEventConsumer);
			if (result == null)
				result = caseObject(logEventConsumer);
			if (result == null)
				result = caseIDLEntity(logEventConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOG_EVENT_CONSUMER_OPERATIONS: {
			LogEventConsumerOperations logEventConsumerOperations = (LogEventConsumerOperations) theEObject;
			T result = caseLogEventConsumerOperations(logEventConsumerOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOG_CONFIGURATION: {
			LogConfiguration logConfiguration = (LogConfiguration) theEObject;
			T result = caseLogConfiguration(logConfiguration);
			if (result == null)
				result = caseLogConfigurationOperations(logConfiguration);
			if (result == null)
				result = caseObject(logConfiguration);
			if (result == null)
				result = caseIDLEntity(logConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.LOG_CONFIGURATION_OPERATIONS: {
			LogConfigurationOperations logConfigurationOperations = (LogConfigurationOperations) theEObject;
			T result = caseLogConfigurationOperations(logConfigurationOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.OBJECT: {
			org.omg.CORBA.Object object = (org.omg.CORBA.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = casePortOperations(port);
			if (result == null)
				result = caseObject(port);
			if (result == null)
				result = caseIDLEntity(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT_OPERATIONS: {
			PortOperations portOperations = (PortOperations) theEObject;
			T result = casePortOperations(portOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT_SET: {
			PortSet portSet = (PortSet) theEObject;
			T result = casePortSet(portSet);
			if (result == null)
				result = casePortSetOperations(portSet);
			if (result == null)
				result = casePortSupplier(portSet);
			if (result == null)
				result = casePortSupplierOperations(portSet);
			if (result == null)
				result = caseObject(portSet);
			if (result == null)
				result = caseIDLEntity(portSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT_SET_OPERATIONS: {
			PortSetOperations portSetOperations = (PortSetOperations) theEObject;
			T result = casePortSetOperations(portSetOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT_SUPPLIER: {
			PortSupplier portSupplier = (PortSupplier) theEObject;
			T result = casePortSupplier(portSupplier);
			if (result == null)
				result = casePortSupplierOperations(portSupplier);
			if (result == null)
				result = caseObject(portSupplier);
			if (result == null)
				result = caseIDLEntity(portSupplier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PORT_SUPPLIER_OPERATIONS: {
			PortSupplierOperations portSupplierOperations = (PortSupplierOperations) theEObject;
			T result = casePortSupplierOperations(portSupplierOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PROPERTY_EMITTER: {
			PropertyEmitter propertyEmitter = (PropertyEmitter) theEObject;
			T result = casePropertyEmitter(propertyEmitter);
			if (result == null)
				result = casePropertyEmitterOperations(propertyEmitter);
			if (result == null)
				result = caseObject(propertyEmitter);
			if (result == null)
				result = caseIDLEntity(propertyEmitter);
			if (result == null)
				result = casePropertySetOperations(propertyEmitter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PROPERTY_EMITTER_OPERATIONS: {
			PropertyEmitterOperations propertyEmitterOperations = (PropertyEmitterOperations) theEObject;
			T result = casePropertyEmitterOperations(propertyEmitterOperations);
			if (result == null)
				result = casePropertySetOperations(propertyEmitterOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PROPERTY_SET: {
			PropertySet propertySet = (PropertySet) theEObject;
			T result = casePropertySet(propertySet);
			if (result == null)
				result = casePropertySetOperations(propertySet);
			if (result == null)
				result = caseObject(propertySet);
			if (result == null)
				result = caseIDLEntity(propertySet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.PROPERTY_SET_OPERATIONS: {
			PropertySetOperations propertySetOperations = (PropertySetOperations) theEObject;
			T result = casePropertySetOperations(propertySetOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.RESOURCE: {
			Resource resource = (Resource) theEObject;
			T result = caseResource(resource);
			if (result == null)
				result = caseResourceOperations(resource);
			if (result == null)
				result = caseLifeCycle(resource);
			if (result == null)
				result = caseTestableObject(resource);
			if (result == null)
				result = casePropertyEmitter(resource);
			if (result == null)
				result = casePortSet(resource);
			if (result == null)
				result = caseLogging(resource);
			if (result == null)
				result = caseLifeCycleOperations(resource);
			if (result == null)
				result = caseTestableObjectOperations(resource);
			if (result == null)
				result = casePropertyEmitterOperations(resource);
			if (result == null)
				result = casePortSetOperations(resource);
			if (result == null)
				result = casePortSupplier(resource);
			if (result == null)
				result = caseLoggingOperations(resource);
			if (result == null)
				result = caseLogEventConsumer(resource);
			if (result == null)
				result = caseLogConfiguration(resource);
			if (result == null)
				result = casePropertySetOperations(resource);
			if (result == null)
				result = casePortSupplierOperations(resource);
			if (result == null)
				result = caseObject(resource);
			if (result == null)
				result = caseIDLEntity(resource);
			if (result == null)
				result = caseLogEventConsumerOperations(resource);
			if (result == null)
				result = caseLogConfigurationOperations(resource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.RESOURCE_FACTORY: {
			ResourceFactory resourceFactory = (ResourceFactory) theEObject;
			T result = caseResourceFactory(resourceFactory);
			if (result == null)
				result = caseResourceFactoryOperations(resourceFactory);
			if (result == null)
				result = caseObject(resourceFactory);
			if (result == null)
				result = caseIDLEntity(resourceFactory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.RESOURCE_FACTORY_OPERATIONS: {
			ResourceFactoryOperations resourceFactoryOperations = (ResourceFactoryOperations) theEObject;
			T result = caseResourceFactoryOperations(resourceFactoryOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.RESOURCE_OPERATIONS: {
			ResourceOperations resourceOperations = (ResourceOperations) theEObject;
			T result = caseResourceOperations(resourceOperations);
			if (result == null)
				result = caseLifeCycleOperations(resourceOperations);
			if (result == null)
				result = caseTestableObjectOperations(resourceOperations);
			if (result == null)
				result = casePropertyEmitterOperations(resourceOperations);
			if (result == null)
				result = casePortSupplierOperations(resourceOperations);
			if (result == null)
				result = casePropertySetOperations(resourceOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.TESTABLE_OBJECT: {
			TestableObject testableObject = (TestableObject) theEObject;
			T result = caseTestableObject(testableObject);
			if (result == null)
				result = caseTestableObjectOperations(testableObject);
			if (result == null)
				result = caseObject(testableObject);
			if (result == null)
				result = caseIDLEntity(testableObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CfPackage.TESTABLE_OBJECT_OPERATIONS: {
			TestableObjectOperations testableObjectOperations = (TestableObjectOperations) theEObject;
			T result = caseTestableObjectOperations(testableObjectOperations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.omg.CORBA.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLEntity(IDLEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateDevice(AggregateDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateDeviceOperations(AggregateDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Executable Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Executable Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExecutableDevice(AggregateExecutableDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Executable Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Executable Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExecutableDeviceOperations(AggregateExecutableDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Loadable Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Loadable Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateLoadableDevice(AggregateLoadableDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Loadable Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Loadable Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateLoadableDeviceOperations(AggregateLoadableDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Plain Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Plain Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatePlainDevice(AggregatePlainDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Plain Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Plain Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatePlainDeviceOperations(AggregatePlainDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationManager(AllocationManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Manager Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Manager Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationManagerOperations(AllocationManagerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationFactory(ApplicationFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Factory Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Factory Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationFactoryOperations(ApplicationFactoryOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationOperations(ApplicationOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManager(DeviceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Manager Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Manager Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceManagerOperations(DeviceManagerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceOperations(DeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainManager(DomainManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Manager Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Manager Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainManagerOperations(DomainManagerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Channel Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Channel Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChannelManager(EventChannelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Channel Manager Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Channel Manager Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChannelManagerOperations(EventChannelManagerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableDevice(ExecutableDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableDeviceOperations(ExecutableDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileManager(FileManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Manager Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Manager Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileManagerOperations(FileManagerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileOperations(FileOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystem(FileSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemOperations(FileSystemOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCycle(LifeCycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCycleOperations(LifeCycleOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadable Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadable Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadableDevice(LoadableDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadable Device Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadable Device Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadableDeviceOperations(LoadableDeviceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogging(Logging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logging Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logging Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoggingOperations(LoggingOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Event Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Event Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogEventConsumer(LogEventConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Event Consumer Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Event Consumer Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogEventConsumerOperations(LogEventConsumerOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogConfiguration(LogConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Configuration Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Configuration Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogConfigurationOperations(LogConfigurationOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortOperations(PortOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSet(PortSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Set Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Set Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSetOperations(PortSetOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSupplier(PortSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Supplier Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Supplier Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSupplierOperations(PortSupplierOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Emitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Emitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEmitter(PropertyEmitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Emitter Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Emitter Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEmitterOperations(PropertyEmitterOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertySet(PropertySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Set Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Set Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertySetOperations(PropertySetOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceFactory(ResourceFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Factory Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Factory Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceFactoryOperations(ResourceFactoryOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceOperations(ResourceOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestableObject(TestableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testable Object Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testable Object Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestableObjectOperations(TestableObjectOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CfSwitch
