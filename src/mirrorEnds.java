public class mirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }
    public static String mirrorEnds(String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == (str.charAt(str.length() - 1 - i))){
                result += str.charAt(i);
            }else{
                break;
            }
        }
        return result;

    }
}
