package src.lesson12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        navigator.add("/path/to/file", new FileData("files.txt", 100, "/path/to/file"));
        navigator.add("/path/to/file", new FileData("firstApp.java", 200, "/path/to/file"));
        navigator.add("/path/to/file", new FileData("files1.txt", 150, "/path/to/file"));
        navigator.add("/path/to/file", new FileData("files2.txt", 120, "/path/to/file"));
        navigator.add("/path/to/file", new FileData("files3.txt", 180, "/path/to/file"));
        navigator.add("/path/to/path", new FileData("files4.txt", 150, "/path/to/path"));
        navigator.add("/path/to/path", new FileData("files5.txt", 140, "/path/to/path"));

        System.out.println("Files found in /path/to/file:");
        List<FileData> result1 = navigator.find("/path/to/file");
        for (FileData file : result1) {
            System.out.println(file.getName());
        }
        System.out.println("Files filtered by size (maxSize = 150):");
        List<FileData> result2 = navigator.filterBySize("/path/to/file", 150);
        for (FileData file : result2) {
            System.out.println(file.getName());
        }

        System.out.println("Removing files in /path/to/file");
        navigator.remove("/path/to/file");

        System.out.println("Files sorted by size:");
        List<FileData> result3 = navigator.sortBySize();
        for (FileData file : result3) {
            System.out.println(file.getName());
        }
    }
}