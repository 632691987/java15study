package org.jdk15study.sealedstudy;

import org.junit.Test;

public class StudentApplication
{

    @Test
    public void test1() {
        String s1 = "version2";
        Object obj = s1;

        if (obj instanceof String s) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        //Student s = new Student1();

    }

}
