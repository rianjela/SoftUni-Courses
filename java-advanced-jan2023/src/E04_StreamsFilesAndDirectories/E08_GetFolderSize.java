package E04_StreamsFilesAndDirectories;

import java.io.File;

public class E08_GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);

        File[] allFiles = folder.listFiles();

        int folderSize = 0;
        if (allFiles != null) {
            for (File file : allFiles) {
                folderSize += file.length();
            }

            System.out.println("Folder size: " + folderSize);
        }
    }
}
