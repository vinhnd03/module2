package case_study.entity;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String name, double area, long price, int max, String type, String roomStandard, double poolArea, int numberOfFloors) {
        super(id, name, area, price, max, type);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String name, double area, long price, int max, String type, String roomStandard, double poolArea, int numberOfFloors, boolean maintenance) {
        super(id, name, area, price, max, type, maintenance);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String infoToCSVFile() {
        return super.infoToCSVFile() + "," + roomStandard + "," + poolArea + "," + numberOfFloors;
    }
}
