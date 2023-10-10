package n1ex01;

import java.util.ArrayList;
import java.util.Collections;
public class n1ex01 {
    public static void main(String[] args) {
      
                 	
        }
    public static ArrayList<String> returnMonths() {
        ArrayList<String> months = new ArrayList<>();
        
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        Collections.sort(months);
     
        for (String mes : months) {
            System.out.println(mes);
        }
    	    	    	   	    	
		return months;
  	
    }
 }

