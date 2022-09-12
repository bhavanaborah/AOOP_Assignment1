
import java.util.Scanner;

class a1q3 {
  public static void main(String[] args) throws Exception{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the line of text");
	  String txt=sc.next();
    // create a string
    //String txt = "This is Programiz";
    String str1 = "SDMCET";
    //String str2 = "Programming";

    // check if name is present in txt
    // using contains()
    
    int result= txt.compareToIgnoreCase(str1);
    //boolean result = txt.contains(str1);
    if(result==0) {
      System.out.println(str1 + " is present in the string.");
    }
    else {
      throw new SubstringNotFoundException();
    }
  }
}

class SubstringNotFoundException extends Exception{
	public String toString() {
			return " Substring not found";
			
	}
}
