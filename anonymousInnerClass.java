class A
{
    public void show()
    {
        System.out.println("in show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()    //anonymous class
        {
             public void show()
             {
                 System.out.println("in B show");
            }
        };
        obj.show();
    }
}


//we can also use inner class for abstract class