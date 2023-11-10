package latihan1;
import java.util.Scanner;

public class Palindrome{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Yang ingin anda Check Pada Next Palindrome : ");
        int pal = input.nextInt();
        input.close();
        isPalindrome(pal);
        
        
    }
        private static void isPalindrome (int pal){
            while (true) {
                String temp1 = Integer.toString(pal);
                StringBuilder anu = new StringBuilder(temp1).reverse();
                String temp2 = anu.toString();
                ++pal;
                
                if(temp1.equals(temp2)){
                    System.out.println("palindrome nya adalah : " + temp1);
                    break;
                }
                
            }
    
        }
            
}