package case_study.models;

public class Villa extends ServicesAbstract {
public String freeService;

    public Villa() {
    }

    public Villa(String freeService) {
        this.freeService = freeService;
    }

    public Villa(String id, String nameServices, String areaUsing, String payRent, String peopleCapacity, String accomService, String typeRent, String freeService) {
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
        return super.toString()+ freeService ;
    }
}
