package Midterms;
class practice1{
    public static void main(String [] args){
        String [] fruits = {"Apple", "Banana", "Grapes", 
                            "peach", "mango", "durian",
                            "strawberry", "blueberry"};

        for(String fruit : fruits){
            System.out.println(fruit);
        }


        String [] sweetFruits = new String [5];
        System.arraycopy(fruits, 3, sweetFruits, 0, 2);
        
        System.out.print("\n---------------------\n");

        for(String sweetFruit : sweetFruits){
            System.out.println(sweetFruit);
        }

        System.out.print("\n---------------------\n");

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] numbers2 = new int [10];

        for(int number : numbers){
            System.out.println(number);
        }

        System.out.print("\n---------------------\n");

        System.arraycopy(numbers, 2, numbers2, 2, 5);

        for(int number2 : numbers2){
            System.out.println(number2);
        }

    }
}