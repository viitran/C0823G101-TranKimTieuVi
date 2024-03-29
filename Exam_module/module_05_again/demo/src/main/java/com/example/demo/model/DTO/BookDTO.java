package com.example.demo.model.DTO;

import com.example.demo.model.BookCategory;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BookDTO {

    private Long id;
    @NotBlank(message = "Tên sách không được bỏ trống")
    private String name;
    @Pattern(regexp = "^BO-[0-9]{4}$", message = "Mã sách phải có định dạng BO-XXXX (X là số)")
    private String code;
    @Pattern(regexp = "^(10|[1-9]\\d*)$", message = "Vui lòng nhập số lượng sách hợp lệ")
    private Integer quantity;
    @Pattern(regexp =
            "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$ && !(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](20)\\d\\d$ && !(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$ >= (0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](20)\\d\\d$"
            , message = "vui lòng nhập đúng định dạng dd/MM/yyyy và không lớn hơn ngày hiện tại")
    private String date;

   private BookCategory bookCategory;

    public BookDTO() {
    }

    public BookDTO(Long id, String name, String code, Integer quantity, String date, BookCategory bookCategory) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.date = date;
        this.bookCategory = bookCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
    //    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//
//    }
}
