package com.elguindy.d_i;

import org.springframework.stereotype.Component;
@Component
public class Dev {
    Laptop l = new Laptop();

    public String build(){
        return l.myLaptop() + "\nDev is WORKING";
    }

}
