public class countYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));

    }
    public static Integer countYZ(String str){
        Integer count =0;
        String [] strings = str.split("[^a-zA-Z]");
        for(String s: strings){
            if(s.length() > 0){
                String last = s.substring(s.length()-1);

                if(last.equalsIgnoreCase("y") || last.equalsIgnoreCase("z") ){
                    count++;
                }}

        }
        return count;

    }
}
