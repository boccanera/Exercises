package Books.CleanCode.Misc;

public class ExceptionWrapper {

//    DONT DO THIS

//    ACMEPort port = new ACMEPort(12);
//try
//
//    {
//        port.open();
//    } catch(
//    DeviceResponseException e)
//
//    {
//        report PortError (e);
//        logger.log("Device response exception", e);
//    } catch(
//    ATM1212UnlockedException e)
//
//    {
//        reportPortError(e);
//
//    }
//}
//
//logger.log("Unlock exception", e);
//        } catch (GMXError e) {
//        reportPortError(e);
//        logger.log("Device response exception");
//        } finally{
//
//        }

//Correct way

//public class LocalPort {
//
//}
//    private ACMEPort innerPort;
//    public LocalPort (int portNumber) {
//        innerPort = new ACMEPort (portNumber);
//    }
//
//    public void open() {
//        try {
//            innerPort.open();
//        } catch (DeviceResponseException e) {
//            throw new PortDeviceFailure(e);
//        } catch (ATM1212UnlockedException e) {
//            throw new PortDeviceFailure(e);
//        } catch (GMXError e) {
//            throw new PortDeviceFailure(e);
//        }
//    }

}