package case_study.entity;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, double area, long price, int max, String type, String freeService) {
        super(id, name, area, price, max, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }
}
