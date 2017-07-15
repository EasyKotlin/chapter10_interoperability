package com.easy.kotlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by jack on 2017/7/15.
 */

@RunWith(JUnit4.class)
public class OverridesFunWithDefaultParamsTest {
    @Test
    public void testOverridesFunWithDefaultParams() {
        OverridesFunWithDefaultParams ofdp = new OverridesFunWithDefaultParams();
        ofdp.f1(1, "a");
        ofdp.f2();
        ofdp.f2(2);
        ofdp.f2(2, "b");
    }
}
