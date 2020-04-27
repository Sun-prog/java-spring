package ru;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> classic = new ArrayList<>();
        classic.add("Hungarian Rhapsody");
        classic.add("Sonata 1");
        classic.add("Sonata 6");

        return classic;
    }
}
