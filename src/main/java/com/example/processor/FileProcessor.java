package com.example.processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessor {

    public List<String> readWords(String filePath) throws IOException {
        return Files.lines(Path.of(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .filter(word -> !word.isBlank())
                .collect(Collectors.toList());
    }
}
