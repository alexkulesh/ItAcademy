package homework17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Task Validation. Провалидировать адрес электронного  кошелька, пример начало
 * всегда с букв 'E' 'D' 'R' после буквы следает 12 чисел, возможен ввод с
 * пробелами это не должно влять на нашу проверку
 */

public class TaskValidation {
    private static final Pattern PATTERN = Pattern.compile("(\\s*)[E,D,R]{1}(\\s*)([0-9](\\s*)){12}");
    public static void main(String[] args) {
        String address1 = "888888888888";
        String address2 = "DF99999999999";
        String address3 = "R122122122122";
        Matcher matcher1 = PATTERN.matcher(address1);
        Matcher matcher2 = PATTERN.matcher(address2);
        Matcher matcher3 = PATTERN.matcher(address3);
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
    }
}
