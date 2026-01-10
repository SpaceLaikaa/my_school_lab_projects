package bymyself.GuitarTabManager;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileWriter;

public class Main {

    public String[] FileLocator(String Path){
        Scanner reader = null;

        try{
            reader = new Scanner(Paths.get(Path));


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){reader.close();}
        }

        return
    }


    public void main(String[] args){


    }
}
