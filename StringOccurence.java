import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {
    public static void main(String[] args)
    {
        String name = "Nicee Pvtt Ltd";

        Map<Character, Long> charCount = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        charCount.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
