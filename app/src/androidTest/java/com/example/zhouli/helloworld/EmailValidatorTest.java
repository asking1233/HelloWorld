package com.example.zhouli.helloworld;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by zhouli on 16/5/8.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrectEmail_Return_true() {

        assertThat(EmailValidator.isZhouliEmail("zhouli"),is(true));

    }
}
