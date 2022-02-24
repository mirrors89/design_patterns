package com.mirrors89.design_patterns.singleton;

public class Settings_NotSafeByMultiThread {

    private static Settings_NotSafeByMultiThread instance;

    // 외부에서 인스턴스를 만들지 못하도록 접근 제어자로 제어
    private Settings_NotSafeByMultiThread() {
    }

    // 멀티스레드에서는 안전하지 않다.
    public static Settings_NotSafeByMultiThread getInstance() {
        // if문 안에서 새로운 인스턴스를 생성하기 전에 다른 스레드에서 if문을 실행하면 다른 스레드에서도 새로운 인스턴스를 생성함
        if(instance == null) {
            instance = new Settings_NotSafeByMultiThread();
        }
        return instance;
    }
}
