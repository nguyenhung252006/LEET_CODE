public class Check_If_Two_String_Arrays_are_Equivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        for (String a : word1) {
            str1.append(a);
        }
        for (String b : word2) {
            str2.append(b);
        }

        if (str1.toString().equals(str2.toString())) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.print(arrayStringsAreEqual(word1, word2));
    }

}
