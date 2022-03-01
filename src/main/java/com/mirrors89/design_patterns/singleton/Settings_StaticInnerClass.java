package com.mirrors89.design_patterns.singleton;

import java.io.Serializable;

public class Settings_StaticInnerClass implements Serializable {


    private Settings_StaticInnerClass() {
    }

    private static class SettingsHolder {
        private static final Settings_StaticInnerClass INSTANCE = new Settings_StaticInnerClass();
    }

    // 멀티 스레드 환경에서도 안전하며
    // getInstance() 메소드를 호출할 때 SettingsHolder 클래스를 로딩하기때문에 Lazy하게 사용가능ㅎ
    public static Settings_StaticInnerClass getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 할 때 새로운 인스턴스를 생성하지 않도록 대응
    protected Object readResolve() {
        return getInstance();
    }
}
