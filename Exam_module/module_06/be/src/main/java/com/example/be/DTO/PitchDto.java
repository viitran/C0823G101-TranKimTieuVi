package com.example.be.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PitchDto {
    private Integer id;
    @NotBlank(message = "Tên sân bóng không được bỏ trống!")
    private String name;
    @NotBlank(message = "Địa chỉ sân không được bỏ trống!")
    private String address;
    private Integer idArea;
    private Integer idPitch;
    private Integer idType;
    private Integer idTime;
}
