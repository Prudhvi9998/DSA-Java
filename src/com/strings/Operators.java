package com.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' * 3);
        System.out.println((char)('a' * 3));
        System.out.println("a" + 1);
        // As we know strings will not be converted to their ascii values, and this methods calls toString
        System.out.println("prudhvi" + new ArrayList<>());
    }
}
