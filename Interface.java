class Laptop
{
    public void code()
    {
        System.out.println("code compile run");
    }
}



class Developer  
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}





public class Interface {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer sai = new Developer();
        sai.devApp(lap);
    }
}
