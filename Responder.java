import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response, based on specified input.
 * Input is presented to the responder as a set of words, and based on those
 * words the responder will generate a String that represents the response.
 *
 * Internally, the reponder uses a HashMap to associate words with response
 * strings and a list of default responses. If any of the input words is found
 * in the HashMap, the corresponding response is returned. If none of the input
 * words is recognized, one of the default responses is randomly chosen.
 * 
 * @version    1.0
 * @author     Michael Kolling and David J. Barnes
 */
public class Responder
{

    private Map<String, String> responseMap;
    private List<String> defaultResponses;
    private List<String> welcome;
    private List<String> farewell;
    
    private Random randomGenerator;

    /**
     * Construct a Responder
     */
    public Responder(Answers answers)
    {
        responseMap = answers.getAnswers();
        defaultResponses = answers.getDefaultAnswers();
        welcome = answers.getWelcome();
        farewell = answers.getFarewell();
        randomGenerator = new Random();
    }

    /**
     * Generate a response from a given set of input words.
     * 
     * @param words  A set of words entered by the user
     * @return       A string that should be displayed as the response
     */
    public String generateResponse(Set<String> words)
    {
        if (words.isEmpty())
        {
            return "Sorry, try again.";
        }
        else
        {
            Set<String> keys = new HashSet<String>(this.responseMap.keySet());
            keys.retainAll(words);
            if (keys.isEmpty())
            {
                return this.pickDefaultResponse();
            }
            else
            {
                Object[] l = keys.toArray();
                return this.responseMap.get(
                    l[randomGenerator.nextInt(l.length)]);
            }

        }
    }

    /**
     * Randomly select and return one of the default responses.
     * @return     A random default response
     */
    private String pickDefaultResponse()
    {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }
    
    public List<String> getFarewell()
    {
        return this.farewell;
    }
    
    public List<String> getWelcome()
    {
        return this.welcome;
    }
}
