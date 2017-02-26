
package cinema.seatreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CinemaException", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
public class ICinemaUnlockCinemaException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CinemaException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ICinemaUnlockCinemaException(String message, CinemaException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ICinemaUnlockCinemaException(String message, CinemaException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: cinema.seatreservation.CinemaException
     */
    public CinemaException getFaultInfo() {
        return faultInfo;
    }

}
