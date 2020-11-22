package case_study.models;

public class Customers {
    private String name;
    private String birth;
    private String gender;
    private String numId;
    private String phone;
    private String email;
    private String kindCustomer;
    private String address;
    private String serviceObject;

    public Customers() {
    }

    public Customers(String name, String birth, String gender, String numId, String phone, String email, String kindCustomer, String address, String serviceObject) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.numId = numId;
        this.phone = phone;
        this.email = email;
        this.kindCustomer = kindCustomer;
        this.address = address;
        this.serviceObject = serviceObject;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKindCustomer() {
        return kindCustomer;
    }

    public void setKindCustomer(String kindCustomer) {
        this.kindCustomer = kindCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceObject() {
        return serviceObject;
    }

    public void setServiceObject(String serviceObject) {
        this.serviceObject = serviceObject;
    }
    public void showInFor(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return name+","+birth +","+ gender +"," +numId +"," +phone +"," +email +"," + kindCustomer +"," +address +"," + serviceObject ;
    }
}
