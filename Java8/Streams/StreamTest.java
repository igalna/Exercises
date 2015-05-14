import java.util.stream.Stream;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
    
        int[] intArray = {99,1,2,3,4,3,5};
        
        System.out.println(Arrays.stream(intArray)
            .filter(x -> x == 3)
            .findFirst()
            .orElse(0));
        
        System.out.println(Arrays.stream(intArray)
            .map(x -> x * x)
            .filter(x -> x % 2 == 0)
            .sum());
        
        /* System.out.println(Stream.of(intArray)
            .filter(x -> x == 3)
            .findFirst()
            .orElse(null)
            .forEach(System.out.println())); */
    
        System.out.println(Arrays.stream(intArray)
            .max()
            .orElse(0));
            
        System.out.println(Arrays.stream(intArray)
            .sorted()
            .forEach(System.out.println));
            /* .orElse(0)); */
    
    }
}
