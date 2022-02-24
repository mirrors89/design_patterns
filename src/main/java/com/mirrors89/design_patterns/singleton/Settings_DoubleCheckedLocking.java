package com.mirrors89.design_patterns.singleton;

public class Settings_DoubleCheckedLocking {

    private static volatile Settings_DoubleCheckedLocking instance;

    private Settings_DoubleCheckedLocking() {
    }

    public static Settings_DoubleCheckedLocking getInstance() {
        if(instance == null) {
            // 멀티 스레드에서 동시에 if문 내부로 들어오면 동기화 후 다시 인스턴스가 있는지 체크하고 인스턴스를 생성
            // 인스턴스가 있으면 synchronized 를 사용하지 않으므로 동기화를 사용할 때 비용 절감이 가능
            synchronized (Settings_DoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new Settings_DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
