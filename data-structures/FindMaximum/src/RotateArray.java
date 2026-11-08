import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        scanner.close();
        List<Integer> newList = rotateArray(nums);
        System.out.println(newList);
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static List<Integer> rotateArray(List<Integer> nums) {
        List<Integer> newList = new ArrayList<>();
        for(int i = nums.size(); i > 0; i--) {
            newList.add(nums.get(i -1));
        }
        return newList;
    }
}
