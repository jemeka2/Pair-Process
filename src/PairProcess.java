import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        //sum
        sum = num1 + num2;

        //product
        product = num1 * num2;

        //average
        average = (num1 + num2) / 2;

        if(sum >= 1000){
            System.out.printf("Sum: %d~ Product: %d Average: %d" , sum, product, average);
        }
        else if(sum >= 200){
            System.out.printf("Sum: %d* Product: %d Average: %d" , sum, product, average);
        }
        else{
            System.out.printf("Sum: %d Product: %d Average: %d" , sum, product, average);
        }

    }

}
