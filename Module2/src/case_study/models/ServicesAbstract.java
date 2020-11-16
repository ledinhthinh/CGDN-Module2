package case_study.models;

public abstract class ServicesAbstract {
    private String id;
    private String nameServices;
    private double areaUsing;
    private double payRent;
    private int peopleCapacity;
    private String typeRent;

    public ServicesAbstract() {
    }

    public ServicesAbstract(String id, String nameServices, double areaUsing, double payRent, int peopleCapacity, String typeRent) {
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

    public double getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(double areaUsing) {
        this.areaUsing = areaUsing;
    }

    public double getPayRent() {
        return payRent;
    }

    public void setPayRent(double payRent) {
        this.payRent = payRent;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
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
        return "Services{" +
                "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUsing=" + areaUsing +
                ", payRent=" + payRent +
                ", peopleCapacity=" + peopleCapacity +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract void addNewService();

    public abstract void editService();

    public abstract void deleteService();

    public abstract void searchService();

    public abstract void sortService();

    public abstract void showInfo();
}

