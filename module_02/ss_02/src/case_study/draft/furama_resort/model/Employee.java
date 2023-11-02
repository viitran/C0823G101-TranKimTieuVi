package case_study.draft.furama_resort.model;

public class Employee {
    private String code;
    private String name;
    private String birthday;
    private String gender;
    private long idCard;
    private String phoneNumber;
    private String email;
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String name, String birthday, String gender, long idCard, String phoneNumber,
                    String email, String level, String position, double wage) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String code, String name, String birthday, String gender, long idCard, String phoneNumber,
                    String email, String level, String position, double wage) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "code: " + code + " | name: " + name + " | birthday: "+ birthday + " | gender: "+ gender + " | idCard: " +
                idCard + " |\nphone number: " + phoneNumber + " | email: " + email +" | position: " + position +
                " | level: " + level + " | wage: " + wage + "$\n--------------";
    }
}
