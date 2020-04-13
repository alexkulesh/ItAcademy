package homework13.task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Task 32. Write 20 random numbers to the binary file. Read the
 * recorded file, print the numbers and their arithmetic mean.
 */

public class Task32 {
    public static void main(String[] args)  {
        DataOutputStream dataOutputStream;
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\USER\\Desktop\\binary.dat")));
            DataOutputStream finalDataOutputStream = dataOutputStream;
            random.ints(10,0, 10)
                    .boxed()
                    .forEach(i -> {
                        try {
                            finalDataOutputStream.writeInt(i);
                        } catch (IOException ex) {
                            System.out.println("There is IOException");
                        }
                    });
            dataOutputStream.close();

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("There is IOException");
        }
        DataInputStream dataInputStream = null;
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\binary.dat")));
        } catch (FileNotFoundException f){
            System.out.println("File not found");
        }
        while (true){
            int result;
            try {
                result = dataInputStream.readInt();
                numbers.add(result);
            } catch (IOException ex) {
                System.out.println("There is IOException");
            }
            try {
                dataInputStream.readInt();
            } catch (EOFException ex){
                break;
            }
            catch (IOException i){
                System.out.println("There is IOException");
            }
        }

        try {
            dataInputStream.close();
        } catch (IOException ex) {
                System.out.println("There is IOException");
        }
       double average = numbers.stream()
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(numbers.toString());
        System.out.println("Average = " + average);
    }
}