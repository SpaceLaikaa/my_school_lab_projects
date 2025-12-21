package lab_projects.lab9;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Format;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;

public class lab9Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path: (example: q1.txt)");
        String filePath = sc.nextLine();

        switch (filePath){
            case "q2.txt", "q2":{
                Scanner reader = null;
                Formatter f = null;
                FileWriter fw = null;

                try{
                    reader = new Scanner(Paths.get("q2.txt"));
                    while (reader.hasNextLine()){
                        String line = reader.nextLine();
                        if(line.trim().isEmpty()) continue;
                        String[] words = reader.nextLine().split(" ");
                        for (int i = 0;i<words.length;i++){
                            words[i]=words[i].replace("Hello","Hi");
                            System.out.println("Replaced 'Hello' with 'Hi' in q2.txt");
                        }
                    }
                }catch (IOException e){
                    System.out.println("Something went wrong");
                }finally {
                    if (reader !=null){reader.close();}
                    if (f != null){f.close();}
                }
            }
        }
    }


}
