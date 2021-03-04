package uaslp.enginering.exam.model;

public class Room
{
    private int Number;
    private String RoomDescription;
    private RoomStatus RoomStatus;

    public Room(int number, String roomDescription, RoomStatus roomStatus) {
        Number = number;
        RoomDescription = roomDescription;
        RoomStatus = roomStatus;
    }

    public int getNumber() {
        return Number;
    }

    public RoomStatus getStatus() {
        return RoomStatus;
    }
}
