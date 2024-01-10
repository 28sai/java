class Computer {
    public void playMusic()
    {
        System.out.println("Music playing");
    }

    public String getMePen(int cost)
    {
        if(cost>=10)
            return "pen";
        
        return "no pen for you";
        
    
}
}

public class methods
{
    public static void main(String[] args)
     {
        Computer comp = new Computer();
        comp.playMusic();
       String str= comp.getMePen(1);
        System.out.println(str);

    }
}