package myapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

public static void main(String[] args) {//specify file's paths to read and write

    String filepath = "src/myapp/demo.txt"; //specify which path to read file 
    String filepath2 = "src/myapp/demo2.txt"; //specify which path to write file
    readFile(filepath); //reads file in specified path
    writeFile(filepath2); //creates filepath2 as specified in String above

}
public static void readFile (String fname){ //read File method 
    //Path object
    Path pth = Paths.get(fname); //making a path from a String
    File fobj = pth.toFile(); //pointing to the file from path provided
    
    //Check if file exists
    if (fobj.exists()) {
        System.out.println("File exists");
    } else {
        System.out.println("File not found");
    }

    //Reader Object (check if file is readable)
    try {
        FileReader fr = new FileReader(fobj); //fobj is the path to file
        BufferedReader bdf = new BufferedReader(fr);//BufferedReader more efficient than FileReader
        String line;
        //String line = bdf.readLine();
       //System.out.println("First line => " + line);

        //line = bdf.readLine();
        //System.out.println("Second line => " + line);

        while (null != (line = bdf.readLine())) { //if line in file is not empty, will keep printing
            System.out.println("> " + line);
        }

        bdf.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("File not found. Please check input file " +e.getMessage());
    }
    catch (IOException e) { //input output exception
        System.out.println("Unable to read line" + e.getMessage());
    }
}    


public static void writeFile (String fname){

//writer object
try {
    FileWriter fw = new FileWriter(fname, false); //append mode /write mo
    //fw.write("apples\n"); //add to file
    //fw.write("orange\n");
    //fw.write("pear\n");

    BufferedWriter bfw = new BufferedWriter(fw);
    bfw.write("apples\n"); //add to file
    bfw.write("orange\n");
    bfw.write("pear\n");

    bfw.flush();//make sure file is saved before close; remember to change from fw to bfw
    bfw.close();

} catch (IOException e){
    System.out.println("Unable to write line " + e.getMessage());
}

}

}