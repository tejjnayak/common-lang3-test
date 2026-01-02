package com.tej.demo;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Uses direct dependency 3.12.0
        System.out.println(StringUtils.upperCase("direct dependency version"));

        // Uses shaded transitive version 3.8.1 (embedded inside helper-all JAR)
        System.out.println(HelperUtil.clean("hello  world"));
        System.out.println(HelperUtil.flip("Tej"));
    }
}

class HelperUtil {
    public static String clean(String str) {
        return str.replaceAll("\\s+", " ");
    }
    public static String flip(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

