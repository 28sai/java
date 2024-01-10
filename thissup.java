class A extends Object //even if we dont mention this Object by defualt it is there so this is ultilevel inheritance
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int b)
    {
        System.out.println("in A int");
    }
}
class B extends A
    {
        public B()
        {
          super();
        System.out.println("in B");
        }

        public B(int a)
        {
            this(); //it will execute the constructor of the same class
            System.out.println("in B int ");
        }
}



public class thissup
{
    public static void main(String[] args)
    {
     
        B obj = new B(5);


    }
}
