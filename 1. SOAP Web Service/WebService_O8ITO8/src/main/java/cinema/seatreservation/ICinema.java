
package cinema.seatreservation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICinema", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICinema {


    /**
     * 
     * @param columns
     * @param rows
     * @throws ICinemaInitCinemaException
     */
    @WebMethod(operationName = "Init", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/Init")
    @RequestWrapper(localName = "Init", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.Init")
    @ResponseWrapper(localName = "InitResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.InitResponse")
    public void init(
        @WebParam(name = "rows", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        int rows,
        @WebParam(name = "columns", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        int columns)
        throws ICinemaInitCinemaException
    ;

    /**
     * 
     * @return
     *     returns cinema.seatreservation.ArrayOfSeat
     * @throws ICinemaGetAllSeatsCinemaException
     */
    @WebMethod(operationName = "GetAllSeats", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/GetAllSeats")
    @WebResult(name = "GetAllSeatsResult", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
    @RequestWrapper(localName = "GetAllSeats", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.GetAllSeats")
    @ResponseWrapper(localName = "GetAllSeatsResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.GetAllSeatsResponse")
    public ArrayOfSeat getAllSeats()
        throws ICinemaGetAllSeatsCinemaException
    ;

    /**
     * 
     * @param seat
     * @return
     *     returns cinema.seatreservation.SeatStatus
     * @throws ICinemaGetSeatStatusCinemaException
     */
    @WebMethod(operationName = "GetSeatStatus", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/GetSeatStatus")
    @WebResult(name = "GetSeatStatusResult", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
    @RequestWrapper(localName = "GetSeatStatus", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.GetSeatStatus")
    @ResponseWrapper(localName = "GetSeatStatusResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.GetSeatStatusResponse")
    public SeatStatus getSeatStatus(
        @WebParam(name = "seat", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        Seat seat)
        throws ICinemaGetSeatStatusCinemaException
    ;

    /**
     * 
     * @param seat
     * @param count
     * @return
     *     returns java.lang.String
     * @throws ICinemaLockCinemaException
     */
    @WebMethod(operationName = "Lock", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/Lock")
    @WebResult(name = "LockResult", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
    @RequestWrapper(localName = "Lock", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.Lock")
    @ResponseWrapper(localName = "LockResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.LockResponse")
    public String lock(
        @WebParam(name = "seat", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        Seat seat,
        @WebParam(name = "count", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        int count)
        throws ICinemaLockCinemaException
    ;

    /**
     * 
     * @param lockId
     * @throws ICinemaUnlockCinemaException
     */
    @WebMethod(operationName = "Unlock", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/Unlock")
    @RequestWrapper(localName = "Unlock", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.Unlock")
    @ResponseWrapper(localName = "UnlockResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.UnlockResponse")
    public void unlock(
        @WebParam(name = "lockId", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        String lockId)
        throws ICinemaUnlockCinemaException
    ;

    /**
     * 
     * @param lockId
     * @throws ICinemaReserveCinemaException
     */
    @WebMethod(operationName = "Reserve", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/Reserve")
    @RequestWrapper(localName = "Reserve", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.Reserve")
    @ResponseWrapper(localName = "ReserveResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.ReserveResponse")
    public void reserve(
        @WebParam(name = "lockId", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        String lockId)
        throws ICinemaReserveCinemaException
    ;

    /**
     * 
     * @param lockId
     * @throws ICinemaBuyCinemaException
     */
    @WebMethod(operationName = "Buy", action = "http://www.iit.bme.hu/soi/hw/SeatReservation/ICinema/Buy")
    @RequestWrapper(localName = "Buy", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.Buy")
    @ResponseWrapper(localName = "BuyResponse", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation", className = "cinema.seatreservation.BuyResponse")
    public void buy(
        @WebParam(name = "lockId", targetNamespace = "http://www.iit.bme.hu/soi/hw/SeatReservation")
        String lockId)
        throws ICinemaBuyCinemaException
    ;

}
