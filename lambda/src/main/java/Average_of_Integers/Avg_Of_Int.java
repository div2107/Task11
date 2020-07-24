package Average_of_Integers;

import java.util.*; 
import java.util.stream.IntStream; 

public class Avg_Of_Int {
	public static void main(String[] args) 
    {
        IntStream stream = IntStream.of(2, 3, 3, 4, 6, 7, 8); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 


}
