
import java.util.*;

class NegativeNumberNotAllowedException extends Exception{
	public String toString() {
		return "NegativeNumberNotAllowedException[Negative Number]";
	}
}

class NumberNotPrimeException extends Exception{
	public String toString() {
		return "NumberNotPrimeException[Number not prime]";
	}
}
public class a1q2 {

	public static void main(String[] args) throws Exception{
		int num,i;
        boolean temp=false;
         
        Scanner sc=new Scanner(System.in);
         
        //input an integer number
        System.out.print("Enter any integer number: ");
        num= sc.nextInt();
         
        //check prime
        for(i=2; i<=(num/2); i++)
        {
            if(num%i==0)
            {
                temp=true;
                break;
            }
        }
        	if(num<0) {
        		throw new NegativeNumberNotAllowedException();
        	}
        
        	else if(temp==true) {
            	throw new NumberNotPrimeException();
            }
        
        	else {
        		System.out.println(num + " is a prime number.");
        	}
 
	}
	
}
