import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class lab9Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: (example: q1.txt)");
        String filePath = sc.nextLine();

        int maxWords = 10000;
        String[] words = new String[maxWords];
        int[] ints=new int[maxWords];

        int totalWords=0;
        int totalUniqueWords=0;

        Scanner reader = null;
        try{
            reader = new Scanner(Paths.get("q1.txt"));
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] lineParts = line.split(" ");
                for(String a :lineParts){
                    for(int i =0;i<words.length;i++){
                        words[totalWords]=words[i];

                    }
                    System.out.println(words[1]);
                }
            }
        }
        catch (IOException e){e.printStackTrace();}
        finally {
            if (reader !=null){reader.close();}
        }
    }
}
