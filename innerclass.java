class A  //static can be only used for innerclass
{
    int age;

    public void show()
    {
             System.out.println("in show");
    }
     class B   
    {
        public void config()
        {
            System.out.println("in config");
        }

    }
}

public class innerclass
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        

      //   B obj1 = new B()a; here B is not openly available 
       //     A.B obj1 = new A.B(); if the B class is static
       A.B obj1=  obj. new B();
        obj1.config();
    }
}


