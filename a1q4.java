
import java.util.Scanner;
import java.io.*;


class a1q4 {

    public static void main(String[] args)throws Exception {


            FileWriter w = new FileWriter("Alphabets.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the data to write in the file :");
            String str = sc.nextLine();
            w.write(str);
            w.close();
            File file = new File("Alphabets.txt");

            Scanner reader = new Scanner(file);
            StringBuilder s = new StringBuilder();
            FileWriter write = new FileWriter("Consonant.txt");
            while(reader.hasNext()){
                String data  = reader.next();
                for (int i = 0; i < data.length(); i++) {
                    if(isVowel(data.charAt(i))){
                        throw new VowelNotAllowedException();

                    }else{

                        s.append(data.charAt(i));
                    }
                }
                write.write(s.toString());
            }


            write.close();

}

    static boolean isVowel(char c) {
        if(c == 'a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I'|| c =='O'|| c =='U'){


            return true;
        }else{
            return false;
        }
    }
}
class VowelNotAllowedException extends Exception{

    public String toString(){
        return "Vowel Not allowed";

    }
}

