
import java.util.Scanner;
//class creation
class animal{
	String type; //instance variable
	String food;
	
	void ChangeFood(String food) { //method declaration
		this.food=food;
	}

}
public class a1q1 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//try catch block
		try {
			//System.out.println("Enter value of  a and b:");
			//int a = 9;
			//int b = 0;
			//int  divi = a/b;
			
			/*int[] intarray = new int[4];
			intarray [0]=1;
			intarray [1]=2;
			intarray [2]=3;
			intarray [3]=4;
			intarray [4]=5;
			*/
			
			animal an = new animal();
			an.setfood("meat");
			
		}//catch(ArithmeticException ae) { //ArithmeticException handling
			//System.out.println("Error 1:"+ae);
		//}
		//catch(ArrayIndexOutOfBoundsException ao) { //ArrayIndexOutOfBounds Exception handling
			//System.out.println("Error 2:"+ao);
		//}
		catch(NoSuchMethodException np) { //NoSuchMethodException handling
			System.out.println("Error 3:"+np);
		}
	}
}