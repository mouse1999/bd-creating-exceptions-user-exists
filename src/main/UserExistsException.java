package main;



/**
 * Custom exception for when we try to create a new user but one with
 * duplicate fields already exists.
 */
public class UserExistsException extends Exception {
    private final long serialVersionUID = -3260242374893918416L;


    public UserExistsException() {
        super();
    }

    public UserExistsException(String message) {
        super(message);
    }

    public UserExistsException(String message, Throwable e) {
        super(message, e);
    }

    public UserExistsException(Throwable e) {
        super(e);
    }


}
