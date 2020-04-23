package ru;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "git push -f origin masterRhapsody";
    }
}
