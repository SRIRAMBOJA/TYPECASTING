package com.sriram.java;

public class TypeCasting {
    public static void main(String[] args) {

      /* IMPLICIT TYPE CASTING*/

        byte age;
        age =35;
        int ageValue;
        ageValue =(int) age;

        /*
        EXPLICIT TYPE CASTING */
        float value;
        value=234573.3f;

        int intValue;
        intValue=(int)value;
        System.out.println(intValue);

        ageValue=130;
        age =(byte)ageValue;
        System.out.println("AGE : " + age);

        byte test = 0;
        System.out.println(test);
    }
}
