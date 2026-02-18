import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));


        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    }

    public static List<List<String>> groupAnagrams(String[] s) {

        Map<String, List<String>> map = Arrays.stream(s).collect(Collectors.groupingBy(
                (word) -> {
                    char[] arr = word.toCharArray();
                    Arrays.sort(arr);
                    return new String(arr);
                }

        ));

        List<List<String>> output = new ArrayList<>();
       map.entrySet().stream().forEach((e) -> {
           output.add(e.getValue().stream().collect(Collectors.toList()));
       });



        return output;
    }
}

