package com.example.zhouli.helloworld;

/**
 * Created by zhouli on 16/5/8.
 */
public class EmailValidator {
    public static boolean isZhouliEmail(String email) {
        if (email.equals("zhouli")) {
            return true;
        }
        return false;
    }
}
