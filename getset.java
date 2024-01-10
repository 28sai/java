
    class Human{
        private int age;  //this
        private String name;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
           this.name = name;
        }
    
    
    }
    
    
    
    public class getset {
        public static void main(String[] args) {
            Human obj = new Human();
            obj.setAge(11);
            obj.setName("saiteja");
            System.out.println(obj.getName() + " "+ obj.getAge());
        }
    }
    

