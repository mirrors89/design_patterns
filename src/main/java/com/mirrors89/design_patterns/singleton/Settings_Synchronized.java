package com.mirrors89.design_patterns.singleton;

public class Settings_Synchronized {

    private static Settings_Synchronized instance;

    private Settings_Synchronized() {
    }

    // 동시에 여러 스레드가 접근하지 않도록 제어
    // 성능에 불이득이 있음
    public static synchronized Settings_Synchronized getInstance() {
        if(instance == null) {
            instance = new Settings_Synchronized();
        }
        return instance;
    }
}
