package Model;

import java.util.LinkedList;

public class Model {
    
    LinkedList<ClassroomDetail> classroomDetails;
    LinkedList<ClassroomReservationData> classroomReservationDatas;

    // region public
    public void createClassroom(){
        classroomDetails.add(new ClassroomDetail("219", "sc-04", "large", 10));
        classroomReservationDatas.add(new ClassroomReservationData(10, 11, 2022, 8, 30, "Software Engineer", "Warangkana Kimparn"));
    }
}
