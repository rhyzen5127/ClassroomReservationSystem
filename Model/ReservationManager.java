package model;

import java.util.HashMap;

public class ReservationManager
{
    // region private variable.
    private HashMap<String, Reservation> reservations = new HashMap<String, Reservation>();

    // region public
    public void readClassroomFile()
    {
        // Excel input here.
        addReservation(new Reservation("SE101120220830", 10, 11, 2022, 8, 30, "Software Engineer", "Warangkana Kimparn"));
    }

    public String toString(String room)
    {
        return null;
    }

    //region getter
    public String getID(String room)
    {
        return reservations.get(room).getID();
    }

    // region setter
    private void addReservation(Reservation reservation)
    {
        reservations.put(reservation.getID(), reservation);
    }

    private void removeReservation(Reservation reservation)
    {
        reservations.remove(reservation.getID(), reservation);
    }

}
