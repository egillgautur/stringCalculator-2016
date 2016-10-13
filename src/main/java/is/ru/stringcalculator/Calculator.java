package is.ru.stringcalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if(numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            String[] splitStr = numbers.split(",");
            String number1 = splitStr[0];
            String number2 = splitStr[1];
            int nr1 = Integer.parseInt(number1);
            int nr2 = Integer.parseInt(number2);

            return nr1 + nr2;
        }
    }
}


