package utilities.generator;

public class RandomNumber {
    public static final String NUMERIC_STRING = "0123456789";

    public static String randomNumber(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
