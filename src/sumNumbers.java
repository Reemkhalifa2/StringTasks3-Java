public class sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));

    }
    public static Integer sumNumbers(String str){
        Integer sum =0;
        String result ="";
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
            if(i==0|| Character.isDigit(str.charAt(i-1)) ){
                result += ch;
                sum+=Integer.parseInt(result);
            }else{

                result = ""+ch;

            }

            }

        }

        return sum;
    }
}
