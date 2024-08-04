package main;

import java.util.ArrayList;
import java.util.List;

/**
 * UserManager manages a list of registered `User`s.
 */
public class UserManager {

    private List<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    /**
     * This method is being mocked by the test for the exercise to actually return true for some tests.
     * @param email - Email address being checked for existence
     * @return whether email is being used
     */
    public boolean isEmailInUse(String email) {
        for(User user : userList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to create new user after checking that it doesn't already exist.
     * @param user - User to be created
     * @return successfully created user
     */
    public User createUser(User user) throws UserExistsException {

        // PARTICIPANTS: Update this method to throw your new exception if the email is already in use.

        if (!(isEmailInUse(user.getEmail()))) {
            userList.add(user);
        } else {
            throw new UserExistsException("User already exist");
        }

        return user;
    }
}
