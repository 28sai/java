class calculator{ 

    int num=5;
public int add(int n1, int n2, int n3){
    int res=n1+n2+n3;
    return res;
}
public int add(int n1, int n2){
    return n1+n2;
}
public double add(int n1, int n2){
    return n1+n2;
}

}

public class calculator2{
    public static void main(String[] args) {
        int a=5,b=6,c=6;
        calculator cal=new calculator();
         calculator cal1=new calculator();
      cal.num=6;
          System.out.println(cal.num);
           System.out.println(cal1.num);

         
        // System.out.println(result);
    }
}




