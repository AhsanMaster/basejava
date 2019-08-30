package com.github.ahsanmaster.basejava;

public class MainString {
    public static void main(String[] args) {
        String[] str = new String[]{"1","2","3","4","5"};
        StringBuilder result = new StringBuilder();
        for ( String s: str) {
            result.append(s).append(";");
        }
        System.out.println(result.toString());
    }
}
