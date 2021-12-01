package CybageAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferenceInTwoDates {

	 static void findDifference(String d1, String d2)   
    {   
        
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");   
        
        try {   
            
            Date date1 = obj.parse(d1);   
            Date date2 = obj.parse(d2);   
              
            long time = date2.getTime() - date1.getTime();  
              
            long days = (time / (1000*60*60*24)) % 365;   
            
            long years = (time / (1000l*60*60*24*365));   
            
            long seconds = (time / 1000)% 60;   
            
            long minutes = (time / (1000*60)) % 60;   
              
            long hours = (time / (1000*60*60)) % 24;   
              
            System.out.print("Difference "+"between two dates is: ");   
            System.out.println( hours+ " hours, "+ minutes+ " minutes, "+ seconds+ " seconds, "+ years+ " years, "+ days+ " days");   
        }   
       
        catch (ParseException excep) {   
            excep.printStackTrace();   
        }   
    }   
     
    public static void main(String[] args)   
    {   
        
        String join = "12-12-2018 02:11:20";   
        String leave  = "1-26-2020 07:15:50";   
        
        findDifference(join, leave);   
    }   
}
