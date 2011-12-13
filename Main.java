public class Main
{
    private Main(){return;}        

    public static void main(String[] args)
    {
        //new SupportSystem(new TechSupportAnswers(), new InputReader(System.in)).start();
        new SupportSystemGUI().start();
    }
}
