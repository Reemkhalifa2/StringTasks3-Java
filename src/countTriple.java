public class countTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("a") );

    }
    public static Integer countTriple(String str){
        Integer count = 0;
        for(int i=0; i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}
