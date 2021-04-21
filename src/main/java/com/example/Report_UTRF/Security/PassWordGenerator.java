package com.example.Report_UTRF.Security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassWordGenerator {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String rawPassword="pass";
        String encodedPassword= encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
