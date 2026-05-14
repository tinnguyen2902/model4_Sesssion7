package com.example.lession9_1.Model.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class ParentDTO {
    @NotBlank(message = "Tên phụ huynh không được trống")
    @Pattern(regexp = "^[A-Z].*", message = "Tên phụ huynh phải viết hoa chữ cái đầu")
    private String name;
    @NotNull(message = "Số điện thoại không được trống")
    @Pattern(regexp = "^0\\d{9}$", message = "Số điện thoại phải bắt đầu bằng số 0 và có đúng 10 số")
    private String phoneNumber;

    public ParentDTO() {
    }

    public ParentDTO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}