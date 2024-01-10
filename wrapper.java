public class wrapper {
    public static void main(String[] args) {
        int num=2;  //num is the primitive variablee
        Integer num1 = new Integer(num);  //num1 is the reference variable
        //now we are storing a primitive in a primitive object this concept is called BOXING

        System.out.println(num1);


        // int a = 7;
        // Integer a1= a;    //BOXING
        //when u store primitive type in object automaticaaly 


        // int a2 = a1.intValue();  //UNBOXING
        //when u take out the primitive type from the object 
        // System.out.println(a2);


        String str = "12";
        int num3 =  Integer.parseInt(str);
        //in Integer class we have parseint method so wiht that we are converting the str into int and storing it in the num3
        
        System.out.println(num3 *2);
    }
}
