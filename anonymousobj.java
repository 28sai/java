class A
{
    public A(){
        System.out.println("Object Created");
    }


    public void show()
    {
        System.out.println("in A show");
    }
}




public class anonymousobj {
    public static void main(String[] args) {
        

        new A();   //anonymous object
        new A().show();
    }
}
