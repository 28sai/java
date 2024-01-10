public class string {
    public static void main(String[] args) {
        // String name = "saiteja";
        String name = new String("saiteja");

        System.out.println(name);
        System.out.println("hello" +" "+name);

        //charAt

        System.out.println(name.charAt(2));

        //concat
        System.out.println(name.concat(" heyyy"));

        name=name+" hello";
        System.out.println(name);
    }
}


//in heap memory we have string constant pool whatwver u create it stores it as  a one obj