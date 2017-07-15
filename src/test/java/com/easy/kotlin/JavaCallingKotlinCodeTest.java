package com.easy.kotlin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by jack on 2017/7/15.
 */

@RunWith(JUnit4.class)
public class JavaCallingKotlinCodeTest {
    @Test
    public void testProperty() {
        Department d = new Department();
        d.setId(1);
        d.setName("技术部");
        d.setBig("Y");
        d.setOpen(true);

        Assert.assertTrue(1 == d.getId());
        Assert.assertTrue("技术部".equals(d.getName()));
        Assert.assertTrue("Y".equals(d.isBig()));
        Assert.assertTrue(d.isOpen());

        System.out.println(d.NO = 10);

        System.out.println(Department.Companion.getInnerID());
        System.out.println(Department.innerName);

        Department.Companion.getObjectID(); // OK
        Department.Companion.getObjectName(); // OK, 唯一的工作方式
        Department.getObjectID(); // ALSO OK
        //Department.getObjectName(); // ERROR

    }

    @Test
    public void testPackageFun() {
        //KotlinExampleKt example = new KotlinExampleKt();

        KotlinExampleKt.f1();
        KotlinExampleKt.f2();
        System.out.println(KotlinExampleKt.getP());
        System.out.println(KotlinExampleKt.swap("abc", 0, 1));

        FinalClassDemo fcd = new FinalClassDemo();
        System.out.println(fcd.name);

        MyKotlinExample.f3();
        MyKotlinExample.f4();
    }
}
