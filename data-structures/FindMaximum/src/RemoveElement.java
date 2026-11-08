import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        int target = scanner.nextInt();
        scanner.close();
        List<Integer> newList = removeElement(nums, target);
        System.out.println(newList);
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static List<Integer> removeElement(List<Integer> nums, int target) {
        List<Integer> newList = new ArrayList<>();
        for(int i =0; i < nums.size(); i++) {
            if(nums.get(i) != target) {
               newList.add(nums.get(i));
            }
        }
        return newList;
    }
}
