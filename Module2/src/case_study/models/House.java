package case_study.models;

public class House extends ServicesAbstract {
    private String freeService;

    public House() {
    }

    public House(String freeService) {
        this.freeService = freeService;
    }

    public House(String id, String nameServices, String areaUsing, String payRent, String peopleCapacity, String accomService, String typeRent, String freeService) {
        super(id, nameServices, areaUsing, payRent, peopleCapacity, accomService, typeRent);
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
        return super.toString()+ freeService;
    }
}
