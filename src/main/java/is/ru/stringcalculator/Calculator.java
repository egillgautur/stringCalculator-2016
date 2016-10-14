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
            String[] splitStr = numbers.split(",|\n");
            int sum = 0;
            for(int i = 0; i < splitStr.length; i++) {
                String str = splitStr[i];
                int nr = Integer.parseInt(str);
                if(nr < 0) {
                    throw new RuntimeException();
                }

                if(nr < 1001) {
                    sum += nr;
                }
                
            }

            return sum;
        }
    }
}


