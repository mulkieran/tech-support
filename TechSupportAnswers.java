import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechSupportAnswers implements Answers
{
    public List<String> getWelcome()
    {
        ArrayList<String> welcome = new ArrayList<String>();
        welcome.add("Welcome to the DodgySoft Technical Support System.");
        welcome.add("");
        welcome.add("Please tell us about your problem.");
        welcome.add("We will assist you with any problem you might have.");
        welcome.add("Please type 'bye' to exit our system.");
        return welcome;
    }

    public List<String> getFarewell()
    {
        ArrayList<String> farewell = new ArrayList<String>();
        farewell.add( "Nice talking to you. Bye...");
        return farewell;
    }
    
    public Map<String, String> getAnswers()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("crash", 
            "Well, it never crashes on our system. It must have something\n" +
            "to do with your system. Tell me more about your configuration.");
        map.put("crashes", 
            "Well, it never crashes on our system. It must have something\n" +
            "to do with your system. Tell me more about your configuration.");
        map.put("slow", 
            "I think this has to do with your hardware. Upgrading your processor\n" +
            "should solve all performance problems. Have you got a problem with\n" +
            "our software?");
        map.put("performance", 
            "Performance was quite adequate in all our tests. Are you running\n" +
            "any other processes in the background?");
        map.put("bug", 
            "Well, you know, all software has some bugs. But our software engineers\n" +
            "are working very hard to fix them. Can you describe the problem a bit\n" +
            "further?");
        map.put("buggy", 
            "Well, you know, all software has some bugs. But our software engineers\n" +
            "are working very hard to fix them. Can you describe the problem a bit\n" +
            "further?");
        map.put("windows", 
            "This is a known bug to do with the Windows operating system. Please\n" +
            "report it to Microsoft. There is nothing we can do about this.");
        map.put("macintosh", 
            "This is a known bug to do with the Mac operating system. Please\n" +
            "report it to Apple. There is nothing we can do about this.");
        map.put("expensive", 
            "The cost of our product is quite competitive. Have you looked around\n" +
            "and really compared our features?");
        map.put("installation", 
            "The installation is really quite straight forward. We have tons of\n" +
            "wizards that do all the work for you. Have you read the installation\n" +
            "instructions?");
        map.put("memory", 
            "If you read the system requirements carefully, you will see that the\n" +
            "specified memory requirements are 1.5 giga byte. You really should\n" +
            "upgrade your memory. Anything else you want to know?");
        map.put("linux", 
            "We take Linux support very seriously. But there are some problems.\n" +
            "Most have to do with incompatible glibc versions. Can you be a bit\n" +
            "more precise?");
        map.put("bluej", 
            "Ahhh, BlueJ, yes. We tried to buy out those guys long ago, but\n" +
            "they simply won't sell... Stubborn people they are. Nothing we can\n" +
            "do about it, I'm afraid.");
        return map;
    }

    public List<String> getDefaultAnswers()
    {
        ArrayList<String> responses = new ArrayList<String>();
        responses.add("That sounds odd. Could you describe that problem in more detail?");
        responses.add("No other customer has ever complained about this before. \n" +
            "What is your system configuration?");
        responses.add("That sounds interesting. Tell me more...");
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not have a dll conflict?");
        responses.add("That is explained in the manual. Have you read the manual?");
        responses.add("Your description is a bit wishy-washy. Have you got an expert\n" +
            "there with you who could describe this more precisely?");
        responses.add("That's not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
        return responses;
    }
}
