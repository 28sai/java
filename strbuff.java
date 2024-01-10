public class strbuff {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Saiteja");
        System.out.println(sb.capacity());   //by default it is 16 
        System.out.println(sb.length());
        System.out.println(sb.append(" thatikonda"));
       

        //strbuffer -> toString

        String str =  sb.toString();
        System.out.println(str);


        sb.delete(0, 7);
        System.out.println(sb);


        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.insert(0, "saiteja");
        System.out.println(sb);




        sb.substring(3);
        System.out.println(sb);


        sb.setLength(20);
        System.out.println(sb);
    }
}
