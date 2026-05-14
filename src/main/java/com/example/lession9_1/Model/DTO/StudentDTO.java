package com.example.lession9_1.Model.DTO;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Size;

public class StudentDTO {
    //LS1
    //Khai báo thuộc tính fullName (Họ tên): Không được để trống, độ dài từ 5 đến 100 ký tự.
    @NotBLank(message = "Họ tên không được trống")
    @Size(min = 5,max = 100,message = "số kí tự họ tên phải nằm trong khoảng 5-100 kí tự")
    private String fullName;

    //Khai báo thuộc tính major (Chuyên ngành): Không được để trống.
    @NotBLank(message = "Chuyên ngành không được để trống")
    private String major;
    //LS2
    // Thêm thuộc tính age (Tuổi): Sinh viên đại học phải từ 18 tuổi trở lên (Sử dụng @Min).
    @Size(min = 18,message = "Tuổi sinh viên phải trên 18")
    private Integer age;
    //Thêm thuộc tính gpa (Điểm trung bình - Double): Thang điểm 10, giá trị phải nằm trong khoảng 0.0 đến 10.0 (Sử dụng @Min, @Max).
    @NotBLank(message = "Điểm không được để trống")
    @Size(min = 0,max = 10)
    private Double gpa;

}