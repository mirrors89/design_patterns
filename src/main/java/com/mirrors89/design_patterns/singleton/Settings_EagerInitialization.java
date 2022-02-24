package com.mirrors89.design_patterns.singleton;

public class Settings_EagerInitialization {

    // 이른 초기화로 생성된 인스턴스를 사용
    private static final Settings_EagerInitialization INSTANCE = new Settings_EagerInitialization();

    private Settings_EagerInitialization() {
    }

    public static synchronized Settings_EagerInitialization getInstance() {
        return INSTANCE;
    }
}
