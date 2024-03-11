package ru.spb.reshenie.javatasks.files;
/*
Запустить внешний процесс (bat, explorer, chrome):
- запустить батник
- выделить заданный файл, открыв его папку в explorer
- открыть ссылку в chrome
 */
import java.io.IOException;

public class ExternalProcess {
    public void runBatchFile(String filePath) {
        try {
            Runtime.getRuntime().exec("cmd /c start " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openFolderInExplorer(String filePath) {
        try {
            Runtime.getRuntime().exec("explorer.exe /select," + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openInChrome(String url) {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}