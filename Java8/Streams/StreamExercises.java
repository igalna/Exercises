import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamExercises {
    
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("Hi", "Hello", "Goodbye", "Welcome",
                                           "Bye", "Adios");
        
        
        words.stream()
            .forEach(x -> System.out.println("  " + x));
    }
    
}
