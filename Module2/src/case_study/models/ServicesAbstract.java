package case_study.models;

public abstract class ServicesAbstract {
    private String id;
    private String nameServices;
   // private String dateOfBirth;
    private String areaUsing;
    private String payRent;
    private String peopleCapacity;
    private String typeRent;
    private String numberOfFloors;



    public ServicesAbstract() {
    }

    public ServicesAbstract(String id, String nameServices, String areaUsing, String payRent, String peopleCapacity,
                            String numberOfFloors, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsing = areaUsing;
        this.payRent = payRent;
        this.peopleCapacity = peopleCapacity;
        this.numberOfFloors = numberOfFloors;
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

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    @Override
    public String toString() {
        return id + ',' +nameServices +','+ areaUsing +','+ payRent +','
                + peopleCapacity +','+ numberOfFloors + ','+typeRent + ',';
    }

}

