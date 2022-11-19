package Model;

public class ClassroomDetail {
    
    // region private
    private String roomNumber;
    private String building;

    /* 
     * size : 0 -> small
     * size : 1 -> medium
     * size : 2 -> large
     * ...
     */
    private int size;
    private int seats;

    /* 
     * Status type : 0 -> Normal
     * Status type : 1 -> Input Error
     * ...
     */
    private int statusCode = 0;
    
    // region constructer
    public ClassroomDetail(String roomNumber, String building, String size, int seats) {
        this.roomNumber = roomNumber;
        this.building = building;
        if(size.equals("small")) this.size = 0;
        else if(size.equals("medium")) this.size = 1;
        else if(size.equals("large")) this.size = 2;
        this.seats = seats;
    }
    
    // region setter
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setSize(String size) {
        if(size.equals("small")) this.size = 0;
        else if(size.equals("medium")) this.size = 1;
        else if(size.equals("large")) this.size = 2;
        else {
            /* Display Err. */
            this.statusCode = 1;
            return;
        }
    }

    public void setSizeByNumber(int size) {
        if(size < 0 || size > 2) {
            /* Display Err. */
            this.statusCode = 1;
            return;
        }
        else this.size = size;
    }

    public void setSeats(int seats) {
        if(seats < 0) {
            /* Display Err. */
            this.statusCode = 1;
            return;
        }
        else this.seats = seats;
    }

    // region getter
    public String getRoomNumber() {
        return this.roomNumber;
    }

    public String getBuilding() {
        return this.building;
    }

    public String getSize() {
        if( size == 0 ) return "small";
        else if( size == 1 ) return "medium";
        else if( size == 2 ) return "large";
        else {
            /* Display Err. */
            this.statusCode = 1;
            return "-1";
        }
    }

    public int getSizeByNumber() {
        return this.size;
    }

    public int getSeats(int seats) {
        return this.seats;
    }

    public int getStatusCode() {
        return statusCode;
    }
}