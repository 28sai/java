
//static variable is shared by all the objects 


//static variables should be called by class name itself we can also call it by obj but avoid it
class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand+" : " + price + " " + network + " " + name);
    }
}


public class staticvar{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="poco";
        obj1.price=23000;
        obj1.network="airtel";
        Mobile.name="smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand="samsung";
        obj2.price=45000;
        obj2.network="airtel";
        Mobile.name="smart phone";

        Mobile.name="phone";

        obj1.show();
        obj2.show();


    }
}
