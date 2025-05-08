package case_study.entity;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String name, double area, long price, int max, String type, String roomStandard, int numberOfFloors) {
        super(id, name, area, price, max, type);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String name, double area, long price, int max, String type, String roomStandard, int numberOfFloors, boolean maintenance) {
        super(id, name, area, price, max, type, maintenance);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String infoToCSVFile() {
        return super.infoToCSVFile() + "," + roomStandard + "," + numberOfFloors+ "," + super.isMaintenance();
    }
}
