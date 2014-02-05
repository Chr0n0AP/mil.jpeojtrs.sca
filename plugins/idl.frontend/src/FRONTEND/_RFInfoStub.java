package FRONTEND;


/**
* FRONTEND/_RFInfoStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/RFInfo.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/


/*******************************/
public class _RFInfoStub extends org.omg.CORBA.portable.ObjectImpl implements FRONTEND.RFInfo
{


  /** unique string that flows with data to describe its RF source*/
  public String rf_flow_id ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_rf_flow_id", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return rf_flow_id (        );
            } finally {
                _releaseReply ($in);
            }
  } // rf_flow_id


  /** unique string that flows with data to describe its RF source*/
  public void rf_flow_id (String newRf_flow_id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_rf_flow_id", true);
                $out.write_string (newRf_flow_id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rf_flow_id (newRf_flow_id        );
            } finally {
                _releaseReply ($in);
            }
  } // rf_flow_id


  /** generic container to describe RF frontend */
  public FRONTEND.RFInfoPkt rfinfo_pkt ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_rfinfo_pkt", true);
                $in = _invoke ($out);
                FRONTEND.RFInfoPkt $result = FRONTEND.RFInfoPktHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return rfinfo_pkt (        );
            } finally {
                _releaseReply ($in);
            }
  } // rfinfo_pkt


  /** generic container to describe RF frontend */
  public void rfinfo_pkt (FRONTEND.RFInfoPkt newRfinfo_pkt)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_rfinfo_pkt", true);
                FRONTEND.RFInfoPktHelper.write ($out, newRfinfo_pkt);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rfinfo_pkt (newRfinfo_pkt        );
            } finally {
                _releaseReply ($in);
            }
  } // rfinfo_pkt

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:FRONTEND/RFInfo:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _RFInfoStub