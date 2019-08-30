package com.github.ahsanmaster.basejava;

import com.github.ahsanmaster.basejava.model.Resume;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Resume r = new Resume();
        Field field = r.getClass().getDeclaredFields()[0];
        field.setAccessible(true);
        field.get(r);
        field.set(r,"new uuid");
        System.out.println(r);

        Method method = r.getClass().getDeclaredMethods()[2];
        method.setAccessible(true);
        System.out.println(method.invoke(r));

    }
}
