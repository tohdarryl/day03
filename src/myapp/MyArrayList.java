package myapp;

import java.util.ArrayList;

public class MyArrayList {

public static void main(String[] args) {
        
    //Create an array object
    ArrayList <String> myList = new ArrayList <String>();

    //Add items to it
    myList.add("apples");
    myList.add("oranges");

    //Loop over and print the ALL item in myList
    for (String item : myList) {
        System.out.println("Item ->" + item);
    }

    //Remove "apples" from this list
    myList.remove("apples");

    //Print the no of item inside the list
    int count = myList.size();
    System.out.println(count);



}

}