




class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
     public void show(){
        System.out.println("in B");
    }
}
class C extends A{
     public void show(){
        System.out.println("in B");
    } 
}



public class dynamicmethod {
    public static void main(String[] args) {
        A obj = new A();
        //it is possible to create reference of super class and the obj of the sub class

        //here obj type is A but the implementation is B

        obj.show();


        obj=new B();
        obj.show();

        obj = new C();
        obj.show();


    }
}
