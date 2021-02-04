import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String,User>  userMap;

    public UserRepository()
    {
        userMap = new HashMap<>();
        userMap.put("Jon", new User("Jon","123"));
        userMap.put("Jønke", new User("Jønke", "321"));
    }

    public boolean checkPassword(String userName, String password)
    {
        User user = userMap.get(userName);
        if (user != null)
        {
           return user.getPassword().equals(password);

        }
        else
        {
            return false;
        }
    }

}
