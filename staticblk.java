class Mobile{
    String brand;  //instnace variable  
    int price;
    static String name;  //static variable


    static {
        name="phone";
        
        System.out.println("in static");
    }
    public void show(){
        System.out.println(brand+" : " + price  + " " + name);
    }

     public Mobile(){
        brand="";
        price=200;
        System.out.println("in constructor");
    }
    

}




public class staticblk {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="poco";
        obj1.price=23000;
        Mobile.name="smart phone";
        obj1.show();
        
        // Mobile obj2 =  new Mobile();
    }
}
