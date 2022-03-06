package com.technologies.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {

    void show();// 1 abstract method

    default void details(){//more than 1 default method

    }
    default void details2(){//more than 1 default method

    }
    static String enquire(){//more than 1 static method
        return "Functional Interface";
    }
    static String enquire2(){//more than 1 static method
        return "Functional Interface";
    }

}
