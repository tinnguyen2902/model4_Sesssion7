package com.example.lession9_1.Model.DTO;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.*;

public class StudentDTO {
    //LS1
    //Khai báo thuộc tính fullName (Họ tên): Không được để trống, độ dài từ 5 đến 100 ký tự.
    @NotBlank(message = "Họ tên không được trống")
    @Size(min = 5,max = 100,message = "số kí tự họ tên phải nằm trong khoảng 5-100 kí tự")
    private String fullName;

    //Khai báo thuộc tính major (Chuyên ngành): Không được để trống.
    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;
    //LS2
    // Thêm thuộc tính age (Tuổi): Sinh viên đại học phải từ 18 tuổi trở lên (Sử dụng @Min).
    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18,message = "Tuổi SV phải trên 18")
    private Integer age;
    //Thêm thuộc tính gpa (Điểm trung bình - Double): Thang điểm 10, giá trị phải nằm trong khoảng 0.0 đến 10.0 (Sử dụng @Min, @Max).
    @NotNull(message = "Điểm không được để trống")
    @Min(value = 0,message = "Điểm phải lớn hơn 0")
    @Max(value = 10,message = "Điểm phải nhỏ hơn 10")
    private Double gpa;
    //LS3
    @Pattern(regexp = "SV\\d{4}$",message = "Mã SV phải có định dạng SVXXXX")
    private String studentCode;

    public StudentDTO() {
    }

    public StudentDTO(String fullName, String major, Integer age, Double gpa, String studentCode) {
        this.fullName = fullName;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
        studentCode= studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        studentCode = studentCode;
    }
}