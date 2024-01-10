class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand+" : " + price + " " + network + " " + name);
    }

    // public static void show1(){

    //     System.out.println(brand+" : " + price + " " + network + " " + name);
       // we cannot use non static variables inside a static method  name is fine
    // }


    public static void show1(Mobile obj){
         System.out.println(obj.brand+" : " + obj.price + " " + obj.network + " " + name);
    }

    

}




public class staticmethod {
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


        Mobile.show1(obj1);
    }
}
