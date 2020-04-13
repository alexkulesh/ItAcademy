package homework14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task 33. List the files and directories of the selected directory on disk.
 * Files and directories must be printed separately.
 */
public class Task33 {
    public static void main(String[] args) {
        System.out.println("All files in this folder");
        try (Stream<Path> walkFiles = Files.walk(Paths.get("C:\\Users\\USER\\Desktop"))) {

            List<String> result = walkFiles.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("There is IOException");
        }
        System.out.println("All folders in this folder");
        try (Stream<Path> walkFolders = Files.walk(Paths.get("C:\\Users\\USER\\Desktop"))) {

            List<String> result = walkFolders.filter(Files::isDirectory)
                    .map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("There is IOException");
        }
    }
}
