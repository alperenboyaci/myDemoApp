package com.mycompany.app;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean  positiveDiffInList(ArrayList<Integer> array, int n1,int n2){
        int difference = n1-n2;
         if (array == null) return false;
         if(difference < 0) return false;

        for(int t: array){
          if(t == difference)
             return true;
        }
        return false;
    }
}
