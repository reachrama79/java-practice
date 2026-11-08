import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int sumOfAll = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int totalOddNum = 0;
        int totalEvenNum = 0;

        for(int i =1 ; i <= times; i++) {
            sumOfAll += i;
            if( i % 2 == 0){
                sumOfEven += i;
                totalEvenNum += 1;
            } else {
                sumOfOdd += i;
                totalOddNum += 1;
            }
        }
        System.out.println(sumOfAll);
        System.out.println("Total Even Num :" + totalEvenNum);
        System.out.println("Sum Of Even :" + sumOfEven);
        System.out.println("Total Odd Num :" + totalOddNum);
        System.out.println("Sum Of Odd :" + sumOfOdd);
    }
}
