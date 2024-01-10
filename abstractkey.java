abstract class Car
{
    public abstract void drive(); //here method is defined
    public abstract void fly();
    //abstract method must have  abstract class but for  abstract class, its need not to have an abstract method


    public void playMusic() //here method is declared
    {
        System.out.println("Play music");
    }
}

//if a class extending the abstract class then it should definitely
//use the memthods of tht abstracct class

abstract class Wagnor extends Car
{
    

    public void drive()   
    {
        System.out.println("driving");
    }
}


class updatedWagnor extends Wagnor
{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
       System.out.println("flying");
    }

}


public class abstractkey {
    public static void main(String[] args) {
        Car obj = new updatedWagnor();   //we cant create object for abstract class
        //we can only   create object for concrete class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}



//summary

// abstract keywords can be used with methods if 
// u want to declare them and if you have any abstract methods
// then yoi have to make the clss as abstract class

// but for abstract class it is not mandatory to have a abstracct methods

// we cant create obj for abstract class

// if you want to create obj you have to get a class whichh implements all the 
// abstracct methods and that class is called as concrete class now for that
// concrete class we can create obj