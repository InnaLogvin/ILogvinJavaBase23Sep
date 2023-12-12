package ua.vodafone.homeworks.classes.login;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }
}
