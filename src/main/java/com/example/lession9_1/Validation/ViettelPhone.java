package com.example.lession9_1.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ViettelPhoneValidatior.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ViettelPhone {
    // Thông báo lỗi mặc định
    String message() default "Số điện thoại không thuộc nhà mạng Viettel";

    // Các tham số bắt buộc của Hibernate Validation
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
