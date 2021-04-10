import java.util.Scanner;
public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    public void milestone1(int first, int second){
        for(int i = first + 1; i <= first * 2 && i < second; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner){
        int num = 0;
        double sum = 0.0;
        int count = 0;
        System.out.println("Enter some numbers: ");
        while(num >= 0){
            num = scanner.nextInt();
            if(num < 0){
                break;
            }
            sum = sum + num;
            count++;
        }
        System.out.println(String.format("The average is: %.2f", sum / count));
    }
    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }

}