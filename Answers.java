import java.util.List;
import java.util.Map;

public interface Answers
{
  Map<String, String> getAnswers();
  List<String> getDefaultAnswers();
  List<String> getWelcome();
  List<String> getFarewell();
}
