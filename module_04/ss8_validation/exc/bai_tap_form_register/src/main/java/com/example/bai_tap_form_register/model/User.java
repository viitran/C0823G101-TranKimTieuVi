package com.example.bai_tap_form_register.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = " Họ không được để trống")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Họ không hợp lệ ")
    private String firstName;
    @NotEmpty(message = " Tên đệm và tên không được để trống")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Tên đệm và tên không hợp lệ ")
    private String lastName;
    @NotEmpty(message = " Số điện thoại không được để trống")
    @Pattern(regexp = "^(07[2-9]|07[06-9]|08[1-9]|09[0-9]|01[2-9])[0-9]{7}$", message = "Số điện thoại không hợp lệ ")
    private String numberPhone;

    @Min(value = 18, message = "Không được dưới 18 tuổi")
    private Integer age;
    @NotEmpty(message = "Email không được để trống")
    @Email(message = "Email Không Hợp Lệ")
    private String email;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String numberPhone, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}