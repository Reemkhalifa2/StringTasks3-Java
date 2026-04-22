public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
       // ""
    }

    public static String sameEnds(String str) {
        String result = "";
        for(int i = 0; i <= str.length() / 2; i++) {
            if(str.substring(0, i).equals(str.substring(str.length() - i))) {
                result = str.substring(0, i);;
            }
        }

        return result;
    }
}