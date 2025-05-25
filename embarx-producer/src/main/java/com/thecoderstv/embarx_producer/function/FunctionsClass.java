package com.thecoderstv.embarx_producer.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionsClass {
    @Bean
    public Function<String, String> toUpperCase() {
        return value -> value.toUpperCase();
    }

    @Bean
    public Function<String, String> checkPalindrome() {
        return value -> {
            if (value == null || value.isEmpty()) {
                return "Input is empty";
            }
            String clean = value.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = new StringBuilder(clean).reverse().toString();
            boolean isPalindrome = clean.equals(reversed);
            return isPalindrome ? "Yes, it's a palindrome" : "No, not a palindrome";
        };
    }
}
