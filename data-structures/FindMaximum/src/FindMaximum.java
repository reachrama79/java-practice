import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        scanner.close();
        int res = findMaximum(nums);
        System.out.println(res);

    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static int findMaximum(List<Integer> nums) {
        int max = nums.getFirst();
        for(Integer num : nums) {
            if(max <= num) {
                max = num;
            }
        }
        return max;
    }
}
