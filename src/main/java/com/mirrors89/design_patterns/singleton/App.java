package com.mirrors89.design_patterns.singleton;

public class App {

    public static void main(String[] args) {
        Settings_NotSafeByMultiThread instance = Settings_NotSafeByMultiThread.getInstance();
        Settings_NotSafeByMultiThread instance1 = Settings_NotSafeByMultiThread.getInstance();

        System.out.println(instance == instance1);
    }
}
