package by.vwbrest.zzap.utils;


public class Util {

    public static String getExpectedErrorMessageFor(String article) {
        return String.format("Товар \"%s\" не найден. Возможно, вы ввели неправильный номер.", article);
    }
}
