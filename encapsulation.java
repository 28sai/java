class Human{
    private int age;  //now this variable will beonly accesible in the same class
    private String name;


    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public void setName(String b){
        name=b;
    }
    public String getName(){
        return name;
    }
}



public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("saiteja");
        System.out.println(obj.getName() + " "+ obj.getAge());
    }
}
