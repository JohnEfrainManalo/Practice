package Archive;
import java.util.Scanner;

class Practice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = input.nextLine(); 
        System.out.print("Hello there, " + name);

        input.close();
    }
}