package week5.utility;

public class Utilities {
    public static int getContainedKeywordIndex(String string, String[] keywords) {
        for (int i = 0; i < keywords.length; ++i) {
            if (string.toLowerCase().contains(keywords[i])) {
                return i;
            }
        }
        return -1;
    }
}
