import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class lab9Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: (example: q1.txt)");
        String filePath = sc.nextLine();

        int maxWords = 10000;

        int[] ints=new int[maxWords];

        int totalWords=0;
        int totalUniqueWords=0;

        switch (filePath){
            case "q1.txt": {
                Scanner reader = null;
                try {
                    reader = new Scanner(Paths.get("q1.txt"));
                    while (reader.hasNextLine()) {
                        String[] words = reader.nextLine().split(" ");

                        for (int i = 0; i < words.length; i++) {
                            words[i] = words[i].replace(",", "");
                            words[i] = words[i].replace(".", "");
                            words[i] = words[i].toLowerCase();
                            System.out.println(words[i]);
                            totalWords++;
                        }
                        System.out.println("--------------");
                    }
                    System.out.println(totalWords);

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        reader.close();
                    }
                }
            }
            default: {
                System.out.println("Please enter a valin input (q1.txt - q2.txt - q3.txt");
            }
        }
    }
}
