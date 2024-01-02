package com.example.song.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Không được bỏ trống")
    @Length(min = 1, max = 799, message = "Tên bài hát không vượt quá 800 ký tu")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Tên bài hát nhập sai")
    @Pattern(regexp = "^[\\p{L}\\d ]+$", message = "không chứa kí tự đặc biệt")
    private String name;
    @NotEmpty(message = "Không được bỏ trống")
    @Length(min = 1, max = 299, message = "Tên nghệ sĩ không vượt quá 300 từ")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = " Tên nghệ sĩ nhập sai")
    @Pattern(regexp = "^[\\p{L}\\d ]+$", message = "không chứa kí tự đặt biệt")
    private String author;
    @NotEmpty(message = "Không được bỏ trống")
    @Pattern(regexp = "^[\\p{L}\\d ]+$", message = "Không chứ kí tự đặt biệt")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = " Thể loại nhập sai")
    @Pattern(regexp = "^[\\w+[\\s\\,]*]+$", message = "khong duoc phep chua ki tu dac biet ngoai tru dau phay!!")
    private String category;

    public Song() {
    }

    public Song(Integer id, String name, String author, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
