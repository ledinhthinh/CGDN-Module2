package my_case_study;

public class PhoneBookApstract {
    private String phone;
    private String group;
    private String fullName;
    private String gender;
    private String address;
    private String dayOfBirth;
    private String email;
    public PhoneBookApstract() {
    }

    public PhoneBookApstract(String phone, String group, String fullName, String gender, String address,String dayOfBirth,String email) {
        this.phone = phone;
        this.group = group;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return phone + ',' + group + ',' + fullName + ',' + gender + ',' + address + ',' + dayOfBirth + ',' + email ;
    }
}
