package model;

import java.util.HashMap;

public class ClassroomManager
{

    // region private variable.
    private HashMap<String, Classroom> classrooms = new HashMap<String, Classroom>();

    // region public
    public void readClassroomFile()
    {
        // Excel input here.
        addRoom(new Classroom("219", "SC-04", 5 , 10, 10));
    }

    public String toString(String room)
    {
        return "Room : "+classrooms.get(room).getRoomID()+
                "\nBuilding : "+classrooms.get(room).getBuildingID()+
                "\nSize : "+classrooms.get(room).getSize()+
                "\nSeats : "+classrooms.get(room).getSeats();
    }

    //region getter
    public String getRoomNumber(String room)
    {
        return classrooms.get(room).getRoomID();
    }

    public String getBuilding(String room)
    {
        return classrooms.get(room).getBuildingID();
    }

    public int[] getSize(String room)
    {
        return classrooms.get(room).getSize();
    }

    public int getSeats(String room)
    {
        return classrooms.get(room).getSeats();
    }

    //region setter
    public void setRoomID(String roomName, String room)
    {
        classrooms.get(room).setRoomID(roomName);
    }

    public void setBuildingID(String room, String building)
    {
        classrooms.get(room).setBuildingID(building);
    }

    public void setSize(String room, int width, int length)
    {
        classrooms.get(room).setSize(width, length);
    }

    public void setSeats(String room, int seats)
    {
        classrooms.get(room).setSeats(seats);
    }

    // register helper
    private void addRoom(Classroom classroom) {
        classrooms.put(classroom.getRoomID(), classroom);
    }
}
