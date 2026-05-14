package com.example.lession9_1.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

public class ViettelPhoneValidatior implements ConstraintValidator<ViettelPhone,String> {
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        // 1. Nếu dữ liệu null thì trả về true (để @NotNull hoặc @NotBlank xử lý riêng)
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return true;
        }

        // 2. Danh sách các đầu số Viettel phổ biến
        List<String> viettelPrefixes = Arrays.asList("086", "096", "097", "098", "032", "033", "034", "035", "036", "037", "038", "039");

        // 3. Kiểm tra logic: Phải có 10 số và bắt đầu bằng đầu số trong danh sách
        if (phoneNumber.length() != 10) {
            return false;
        }

        String prefix = phoneNumber.substring(0, 3);
        return viettelPrefixes.contains(prefix);
    }
}