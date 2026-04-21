public class withoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("Hello ther", "llo"));

    }
    public static String withoutString(String base, String remove){
        String result ="";
        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length() - 1;
            }else {
                result += base.charAt(i);
            }
        }

        return result;
    }
}
