class A
{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A
{
     public void show2(){
        System.out.println("i B show");
    }
}



public class downupcasting {
    public static void main(String[] args) {
        A obj = new B(); // (or) A obj = (A)new B()  :this is upcasting"
        obj.show1();    
        
        B obj1 = (B)obj;  //this is dhowncasting
        obj1.show2();

    }
}
