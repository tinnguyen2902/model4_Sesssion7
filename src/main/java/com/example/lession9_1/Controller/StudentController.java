package com.example.lession9_1.Controller;


import com.example.lession9_1.Model.DTO.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    //LS4
    @PostMapping
    public ResponseEntity<?> createStudent(
            @Valid
            @RequestBody StudentDTO studentDTO,
            BindingResult result
    ){
        // nếu có lỗi
        if (result.hasErrors()){
            String errorMessage = result.getFieldErrors().get(0).getDefaultMessage();
            return  ResponseEntity.badRequest().body(errorMessage);
        }
        return ResponseEntity.ok("Thêm SV thành công");
    }


}