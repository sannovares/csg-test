package com.example.rules;

import com.example.processor.Rule;

import java.util.List;

public class LongWordRule implements Rule {

    @Override
    public void apply(List<String> words) {
        List<String> longWords = words.stream()
                .filter(word -> word.length() > 5)
                .toList();
        System.out.println("Words longer than 5 characters: " + longWords);
    }
}
