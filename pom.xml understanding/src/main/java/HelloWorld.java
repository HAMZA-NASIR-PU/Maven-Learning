import org.apache.commons.lang3.StringUtils;
import myPackage.TestProg;
public class HelloWorld {
    public static void main(String[] args) {
        String text = "Hello, Maven!";
        
        // Using StringUtils from Apache Commons Lang
        String reversedText = StringUtils.reverse(text);
        
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reversedText);

        System.out.println("*********************************************");
        TestProg.print();
    }
}
