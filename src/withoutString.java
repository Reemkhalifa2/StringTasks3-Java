public class withoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("Hello ther", "llo"));

    }
    public static String withoutString(String a, String b){
        String result ="";
        for (int i = 0; i < a.length(); i++) {
            if (i <= a.length() - b.length() && !a.substring(i, i + b.length()).equals(b)) {
                result += a.charAt(i);
            }else {
                i += b.length() - 1;
            }
        }

        return result;
    }
}
