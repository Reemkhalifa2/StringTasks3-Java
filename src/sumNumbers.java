public class sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));

    }
    public static Integer sumNumbers(String str){
        Integer sum =0;
        String result ="";
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)) {
                result += ch;
            }else{
                if(!result.isEmpty()){
                    sum+=Integer.parseInt(result);
                    result="";
                }
            }
        }
        if(!result.isEmpty()){
            sum += Integer.parseInt(result);
        }
        return sum;
    }
}
