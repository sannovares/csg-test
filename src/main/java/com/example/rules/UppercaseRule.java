package com.example.rules;

import com.example.processor.Rule;

import java.util.List;

public class UppercaseRule implements Rule {

    @Override
    public void apply(List<String> words) {
        long count = words.stream()
                .filter(word -> Character.isUpperCase(word.charAt(0)))
                .count();
        System.out.println("Number of words starting with uppercase: " + count);
    }
}
