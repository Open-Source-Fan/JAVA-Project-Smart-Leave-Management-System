package com.hr.storage;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileStorage {
    public static String timestampForFile() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
    }

    public static void saveToFile(String fileName, String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.print(data);
            System.out.println("✅ Saved: " + fileName);
        } catch (IOException e) {
            System.out.println("🚫 Failed to save file: " + e.getMessage());
        }
    }
}
