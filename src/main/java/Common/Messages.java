package Common;

import java.util.ResourceBundle;

public class Messages {

    public static final String ERROR_DIVIDE_BY_ZERO = "Деление на ноль запрещено";
    public static final String ERROR_NOT_POSITIVE_NUMBERS = "Оба числа должны быть положительными";

    private static final ResourceBundle bundle = ResourceBundle.getBundle("messages_ru"); // попробовала реализовать через ресурсы

    public static String getBundle(String key) {
        return bundle.getString(key);
    }
}
