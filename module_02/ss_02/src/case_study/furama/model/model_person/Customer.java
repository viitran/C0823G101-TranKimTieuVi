package case_study.furama.model.model_person;

import case_study.furama.model.model_person.Person;

public class Customer extends Person {
    private String code;
    private String level;
    private String address;

    public Customer(String name, String gender, String birthday, String idCard, String phoneNumber, String mail,
                    String code, String level, String address) {
        super(name, gender, birthday, idCard, phoneNumber, mail);
        this.code = code;
        this.level = level;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
