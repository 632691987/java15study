package org.jdk15study.sealedstudy2;

public sealed interface Flyable permits Pajaro, Pajaro2, Pajaro3
{
    void method1();
}
