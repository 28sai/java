class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
}




public class tostring {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="MSI";
        obj.price=55000;
       // System.out.println(obj);  output : it looks like hexadecimal Laptop@36baf30c

        System.out.println(obj); //by default it has "toString"  method so whenever we try to 
        //print obj it gives :: class name + @ + hexadecimal(hashcode)
        //but if you mention  a method with name toString then it will execute it
        //otherwise it will go  to super class 
    }
}