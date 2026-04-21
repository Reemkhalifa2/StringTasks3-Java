public class gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxgxx"));
    }
    public static Boolean gHappy(String str){
        Boolean found = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'g'){
                if( (i > 0 && str.charAt(i-1) == 'g') ||
                        (i < str.length()-1 && str.charAt(i+1) == 'g') ){
                    found = true;
                } else {
                    found = false;
                }
            }
        }
        return found;
    }
}
