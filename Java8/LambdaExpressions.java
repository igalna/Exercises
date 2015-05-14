import java.util.Arrays;

public class LambdaExpressions {
    
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        
        LambdaExpressions le = new LambdaExpressions();
        
        le.printStrings(strings);
        le.shortestFirst(strings);
        System.out.println(Arrays.asList(strings));
        le.longestFirst(strings);
        System.out.println(Arrays.asList(strings));
        le.firstChar(strings);
        System.out.println(Arrays.asList(strings));
    }
    
    public void printStrings(String[] strings) {
        System.out.println(Arrays.asList(strings));
    }
    
    public void shortestFirst(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
    }
    
    public void longestFirst(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
    }
    
    public void firstChar(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
    }
    
    public void letterE(String[] strings) {
        
    }
}
