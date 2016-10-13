package is.ru.stringcalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(numbers);
        }
    }
}

