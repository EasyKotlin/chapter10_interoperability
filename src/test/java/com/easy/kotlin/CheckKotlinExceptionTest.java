package com.easy.kotlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by jack on 2017/7/15.
 */
@RunWith(JUnit4.class)
public class CheckKotlinExceptionTest {
    @Test
    public void testCheckKotlinException() {
        CheckKotlinException cke = new CheckKotlinException();
        cke.thisIsAFunWithException();// Java编译器不检查这个Kotlin中的异常

        // Kotlin中显示声明了异常，Java编译器会检查这个异常
        // cke.thisIsAnotherFunWithException();
        try {
            cke.thisIsAnotherFunWithException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
