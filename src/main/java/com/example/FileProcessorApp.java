package com.example;

import com.example.processor.FileProcessor;
import com.example.processor.Processor;
import com.example.rules.UppercaseRule;
import com.example.rules.LongWordRule;

import java.io.IOException;
import java.util.List;

public class FileProcessorApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide file paths as arguments.");
            System.exit(1);
        }

        FileProcessor fileProcessor = new FileProcessor();

        for (String filePath : args) {
            try {
                System.out.println("Processing file: " + filePath);

                // Read words from the file
                List<String> words = fileProcessor.readWords(filePath);

                // Create and register rules
                Processor processor = new Processor();
                processor.addRule(new UppercaseRule());
                processor.addRule(new LongWordRule());

                // Apply rules
                processor.applyRules(words);

            } catch (IOException e) {
                System.err.println("Error processing file: " + filePath + " - " + e.getMessage());
            }
        }
    }
}
