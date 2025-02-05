package com.example.processor;

import java.util.ArrayList;
import java.util.List;

public class Processor {

    private final List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void applyRules(List<String> words) {
        for (Rule rule : rules) {
            rule.apply(words);
        }
    }
}
