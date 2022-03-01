package com.mirrors89.design_patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        breakSingleton_reflection();
        breakSingleton_serialize();
    }

    public static void breakSingleton_reflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings_StaticInnerClass instance = Settings_StaticInnerClass.getInstance();

        Constructor<Settings_StaticInnerClass> constructor = Settings_StaticInnerClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings_StaticInnerClass newInstance = constructor.newInstance();

        System.out.println(instance == newInstance);
    }

    public static void breakSingleton_serialize() throws IOException, ClassNotFoundException {
        Settings_StaticInnerClass instance = Settings_StaticInnerClass.getInstance();
        Settings_StaticInnerClass newInstance;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            newInstance = (Settings_StaticInnerClass) in.readObject();
        }

        System.out.println(instance == newInstance);
    }
}
