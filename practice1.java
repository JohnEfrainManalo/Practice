import java.util.Scanner;

class Practice1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter how many rows to print: ");
        int rows = input.nextInt();

        System.out.println("Hello " + name + ", here are the numbers: ");
        for(int i = 1; i<=rows; i++){
            System.out.println(i);
        }
        input.close();
    }
}