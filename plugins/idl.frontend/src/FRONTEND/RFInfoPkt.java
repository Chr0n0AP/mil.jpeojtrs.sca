package FRONTEND;


/**
* FRONTEND/RFInfoPkt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/RFInfo.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class RFInfoPkt implements org.omg.CORBA.portable.IDLEntity
{

  /** unique id that describes this RF flow */
  public String rf_flow_id = null;

  /** current settings */
  public double rf_center_freq = (double)0;
  public double rf_bandwidth = (double)0;
  public double if_center_freq = (double)0;
  public boolean spectrum_inverted = false;

  /** Gives information regarding sensor*/
  public FRONTEND.SensorInfo sensor = null;
  public FRONTEND.PathDelay ext_path_delays[] = null;
  public FRONTEND.RFCapabilities capabilities = null;

  /** Allows for expansion*/
  public CF.DataType additional_info[] = null;

  public RFInfoPkt ()
  {
  } // ctor

  public RFInfoPkt (String _rf_flow_id, double _rf_center_freq, double _rf_bandwidth, double _if_center_freq, boolean _spectrum_inverted, FRONTEND.SensorInfo _sensor, FRONTEND.PathDelay[] _ext_path_delays, FRONTEND.RFCapabilities _capabilities, CF.DataType[] _additional_info)
  {
    rf_flow_id = _rf_flow_id;
    rf_center_freq = _rf_center_freq;
    rf_bandwidth = _rf_bandwidth;
    if_center_freq = _if_center_freq;
    spectrum_inverted = _spectrum_inverted;
    sensor = _sensor;
    ext_path_delays = _ext_path_delays;
    capabilities = _capabilities;
    additional_info = _additional_info;
  } // ctor

} // class RFInfoPkt