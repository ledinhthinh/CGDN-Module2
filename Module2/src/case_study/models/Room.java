package case_study.models;


public class Room extends ServicesAbstract {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameServices, String areaUsing, String payRent, String peopleCapacity, String typeRent, String freeService) {
        super(id, nameServices, areaUsing, payRent, peopleCapacity, typeRent);
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
        return super.toString() + freeService;
    }
}
