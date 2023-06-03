package src.lesson12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(String path, FileData file) {
        if (fileMap.containsKey(path)) {
            List<FileData> fileList = fileMap.get(path);
            fileList.add(file);
        } else {
            List<FileData> fileList = new ArrayList<>();
            fileList.add(file);
            fileMap.put(path, fileList);
        }
    }

    public List<FileData> find(String path) {
        if (fileMap.containsKey(path)) {
            return fileMap.get(path);
        }
        return new ArrayList<>();
    }

    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> result = new ArrayList<>();
        if (fileMap.containsKey(path)) {
            List<FileData> fileList = fileMap.get(path);
            for (FileData file : fileList) {
                if (file.getSize() <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            result.addAll(fileList);
        }
        result.sort((f1, f2) -> Long.compare(f1.getSize(), f2.getSize()));
        return result;
    }
}