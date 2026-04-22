public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
    }
    public static String notReplace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 2 &&
                    str.substring(i, i + 2).equals("is") &&
                    (i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                    (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2)))) {

                result += "is not";
                i++;
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }

}
