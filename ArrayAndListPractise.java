// We are creating a list and an array

import java.util.ArrayList;
public class ArrayAndListPractise{
    public static void main(String[] args){
        // This is an array
        String[] arr = {"Mvuselelo", "Langa", "Sivuyisiwe", "Qhawe", "Ayanda", "Asemahle", "Lwando"};
        // This is a list
        ArrayList <String> myList = new ArrayList <String>();

        for (int i = 0; i < arr.length; i++){
            myList.add(arr[i]);
        }
        System.out.println("This is my small circle:"+ myList);
    }
}