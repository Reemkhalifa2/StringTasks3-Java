public class equalIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
    }
    public static Integer equalIsNot(String str){
        Integer countIs = 0;
        Integer countNot = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("is")){
                countIs++;
            }
        }
        return countIs;
    }

}
