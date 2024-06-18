package Activities;

import java.util.ArrayList;

public class activity9 
{
    public static void main(String[] args) 
{
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Suma");
        myList.add("Ramya");
        myList.add("Leela");
        //Adding object at specific index
        myList.add(3, "Rohit");
        myList.add(1, "Virat");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Arjun is in list: " + myList.contains("Arjun"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Virat");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}




