import java.util.HashMap;
import java.util.Map;

/**
 * CREATED BY Janus @ 2021-02-04 - 16:36
 **/
public class UserRepo {
    private Map<String, User> userMap;

    public UserRepo() {
        userMap = new HashMap<>();
        userMap.put("Jon", new User("Jon", "123"));
        userMap.put("Jønke", new User("Jønke", "321"));

    }

    public boolean checkLogin(String userName, String password) {
        User user = userMap.get(userName);
        if (user != null) {
            return (user.getPassword().equals(password));

        } else {
            return false;

        }


    }

}
