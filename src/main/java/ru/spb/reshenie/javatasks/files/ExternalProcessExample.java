package ru.spb.reshenie.javatasks.files;

import java.io.IOException;

public class ExternalProcessExample {
    public static void executeBatchFile(String pathToBatchFile) {
        try {
            Runtime.getRuntime().exec("cmd /c start " + pathToBatchFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openExplorer(String filePath) {
        try {
            Runtime.getRuntime().exec("explorer.exe /select," + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openChrome(String url) {
        try {
            Runtime.getRuntime().exec("chrome " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}