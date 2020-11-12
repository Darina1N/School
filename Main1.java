package sk.kosickaakademia.kolesarova.files;

import java.io.BufferedReader;

public class Main1 {
    public static void main(String[] args) {
        ReadWriteFiles rwFile=new ReadWriteFiles();
        rwFile.copyFileWithCapital("resource/a.txt");
        rwFile.fileSifre("resource/a.txt");
        rwFile.invisibleIorY("resource/a.txt");
    }
}
