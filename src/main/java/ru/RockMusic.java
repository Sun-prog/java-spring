package ru;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> classic = new ArrayList<>();
        classic.add("Wind cries Mary");
        classic.add("Alice");
        classic.add("We are the champion");

        return classic;

    }
}
