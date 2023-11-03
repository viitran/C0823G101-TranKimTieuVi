package case_study.furama.model.model_person;


import case_study.furama.model.model_person.Person;

public class Employee extends Person {
    private String code;
    private String position;
    private String level;
    private double salary;

    public Employee(String code, String name, String gender, String birthday, String idCard, String phoneNumber
            , String mail, String position, String level, double salary) {
        super(name, gender, birthday, idCard, phoneNumber, mail);
        this.code = code;
        this.position = position;
        this.level = level;
        this.salary = salary;
    }

    public Employee(String name, String gender, String birthday, String idCard, String phoneNumber, String mail,
                    String position, String level, double salary) {
        super(name, gender, birthday, idCard, phoneNumber, mail);
        this.position = position;
        this.level = level;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "code: " + code + " | name: " + getName() + " | birthday: " + getBirthday() + " | gender: " + getGender()
                + " | idCard: " + getIdCard() + " |\nphone number: " + getPhoneNumber() + " | email: " + getMail()
                + " | position: " + position + " | level: " + level + " | wage: " + salary + "$\n--------------";
    }
}

