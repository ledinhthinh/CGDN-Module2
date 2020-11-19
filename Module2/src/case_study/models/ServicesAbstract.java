package case_study.models;

public abstract class ServicesAbstract {
    private String id;
    private String nameServices;
    private String areaUsing;
    private String payRent;
    private String peopleCapacity;
    private String typeRent;

    public ServicesAbstract() {
    }

    public ServicesAbstract(String id, String nameServices, String areaUsing, String payRent, String peopleCapacity, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsing = areaUsing;
        this.payRent = payRent;
        this.peopleCapacity = peopleCapacity;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(String areaUsing) {
        this.areaUsing = areaUsing;
    }

    public String getPayRent() {
        return payRent;
    }

    public void setPayRent(String payRent) {
        this.payRent = payRent;
    }

    public String getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(String peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return id + ',' +nameServices +','+ areaUsing +','+ payRent +','+ peopleCapacity +','+ typeRent + ','
                ;
    }

}

