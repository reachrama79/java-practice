import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).toList();
        int target = scanner.nextInt();
        scanner.close();
        int occurrences = countOccurrences(nums, target);
        System.out.println(occurrences);

    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static int countOccurrences(List<Integer> nums, int target) {
        int occurrences = 0;
        for(Integer num : nums) {
            if(num == target)
                occurrences ++;
        }
        return occurrences;
    }
}
