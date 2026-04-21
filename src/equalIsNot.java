public class equalIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
    public static Boolean equalIsNot(String str){
        Integer countIs = 0;
        Integer countNot = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("is")){
                countIs++;
            }
            
        }for(int j=0; j<str.length()-2; j++){
            if(str.substring(j,j+3).equals("not")){
                countNot++;
            }
        }
        return countNot==countIs;
    }

}
