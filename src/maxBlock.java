public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }
    public static String maxBlock(String str){
        String temp ="";
        String block = "";
        for (int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i) == str.charAt(i - 1)) {
                temp += str.charAt(i);
            } else {
                temp = "" + str.charAt(i);
            }

            if (temp.length() > block.length()) {
                block = temp;
            }
        }

        return block;
    }
}
