package ua.vodafone.homeworks.classes.login;

class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }
    private void validateLogin(String login) throws WrongLoginException {
        if (!login.matches("[a-zA-Z]+") || login.length() > 20) {
            throw new WrongLoginException("Login should contain only English letters and be no longer than 20 characters");
        }
    }

    private void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,25}$") ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password should contain at least one letter, one digit, be between 6 and 25 characters, and match the confirmation");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

