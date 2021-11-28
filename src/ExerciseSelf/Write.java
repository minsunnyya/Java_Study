package ExerciseSelf;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) {

//        try {
//            FileInputStream file = new FileInputStream("C:\\Users\\My PC\\Desktop\\Javahere\\src\\ExerciseSelf\\phonebook.txt");
//            System.out.println(file.read());
//            file.close();
//        } catch (Exception e) {
//        }

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\My PC\\Desktop\\Javahere\\src\\ExerciseSelf\\phonebook.txt");
            for(int i = 0; i<10; i ++){
                System.out.println(i+",스티브리"+i+",01012341231"+i);
                pw.write(i);
                pw.close();
            }
        } catch (Exception e) {
        }
    }
}
