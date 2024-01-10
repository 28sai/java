
//final:>
        //we use final keyword with variable to make it constant
        //we use final keyword with class to stop inheritance
        //we use final keyword with method to stop method override




// public class finalkey {

//     public static void main(String[] args) {
//         final int num = 8;
//          //num = 9; once you assigned the num to final keyword then you cant change it

//          System.out.println(num);
//     }
    
// }

final class Calc  //if you use final keyword then u r basically stopping the inhertiance
{
    public void show()
    //if you dont want to override your method then use (final void....)
    {
            System.out.println("in calc show");
    }           
    public void add(int a, int b)
    {
            System.out.println(a+b);
    }
}

// class Advcalc extends Calc (we cant extend Calc because it has final)
// {
        // public void show()
        // {
        //     System.out.println("in advacalc show");
        // }
// }
public class finalkey {

    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
    
}

