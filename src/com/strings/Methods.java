package com.strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Prudhvi Chowdary";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println("            prudhvi   ".strip());
    }
}
