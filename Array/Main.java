import java.util.Scanner;

class Main{
    public static int addNumbers(int x, int y){
        int sum = x + y;
        return sum;
    }


   //ublic 

   public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
         int number = input.nextInt();

        int a = 10, b = 10;

        int sum = addNumbers(a, b);

    
        System.out.println("Sum: "+ sum);

    }
}

/*What is a constructor in java?





*/