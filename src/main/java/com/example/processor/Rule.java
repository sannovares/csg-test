package com.example.processor;

import java.util.List;

@FunctionalInterface
public interface Rule {
    void apply(List<String> words);
}
