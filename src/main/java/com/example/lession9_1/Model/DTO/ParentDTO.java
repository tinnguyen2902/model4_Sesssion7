package com.example.lession9_1.Model.DTO;

import com.example.lession9_1.Validation.ViettelPhone; // Đảm bảo đã import annotation tự tạo
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ParentDTO {

    // 1. Tên phụ huynh:
    @NotBlank(message = "Tên phụ huynh không được để trống")
    @Pattern(regexp = "^[A-Z].*", message = "Tên phụ huynh phải viết hoa chữ cái đầu")
    private String name;

    // 2. Số điện thoại:
    @NotBlank(message = "Số điện thoại không được để trống")
    @ViettelPhone
    private String phoneNumber;

    public ParentDTO() {
    }

    // 4. Constructor đầy đủ tham số
    public ParentDTO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // 5. Getter và Setter (Chỉ cần một bộ duy nhất)
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