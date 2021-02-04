import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserRepository {

    private Map<String,User>  userMap;

    public UserRepository()
    {
        userMap = new HashMap<>();
        //userMap.put("Jon", new User("Jon","123"));
        //userMap.put("Jønke", new User("Jønke", "321"));
        readUsersFromFile();
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

    private void readUsersFromFile()
    {
        String fileName = "users.txt";
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String userName = scanner.nextLine();
                String password = scanner.nextLine();
                userMap.put(userName, new User(userName, password));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

}
