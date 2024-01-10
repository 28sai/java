//public : accessed anywhere
//private :  accessed only in its same class
//default : accessed in its same package
//protective: works in same package and not works in diff package but works in its  sub class
import tools.*;


public class accessmodifier {
    public static void main(String[] args) {
        inherit obj = new inherit();
        int res=obj.add(4,5);
        System.out.println(res);
    }
}

//                             private     protected       public      default
// same class                  yes         yes             yes         yes

// same package subclass       no          yes           yes           yes

// same package non subclass   no          yes           yes           yes 

// diff package subclass       no          yes           yes           no

// diff package non subclass   no          no            yes           no
