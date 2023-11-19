package ua.vodafone.homeworks.classes.login;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    public void testValidateLogin_ValidLogin() {
        String validLogin = "username";
        try {
            User user = new User(validLogin, "Password1", "Password1");
            assertNotNull(user);
        } catch (Exception e) {
            fail("Exception not expected for valid login");
        }
    }
    @Test
    public void testValidateLogin_InvalidLogin_TooLong() {
        String invalidLogin = "thisIsAVeryLongUsername";
        assertThrows(WrongLoginException.class, () -> {
            new User(invalidLogin, "Password1", "Password1");
        });
    }

    @Test
    public void testValidateLogin_InvalidLogin_ContainsNumbers() {
        String invalidLogin = "user123";
        assertThrows(WrongLoginException.class, () -> {
            new User(invalidLogin, "Password1", "Password1");
        });
    }

    @Test
    public void testValidatePassword_ValidPassword() {
        String validPassword = "Password1";
        try {
            User user = new User("username", validPassword, validPassword);
            assertNotNull(user);
        } catch (Exception e) {
            fail("Exception not expected for valid password");
        }
    }

    @Test
    public void testValidatePassword_InvalidPassword_TooShort() {
        String invalidPassword = "Pw1";
        assertThrows(WrongPasswordException.class, () -> {
            new User("username", invalidPassword, invalidPassword);
        });
    }

    @Test
    public void testValidatePassword_InvalidPassword_NoLetter() {
        String invalidPassword = "123456";
        assertThrows(WrongPasswordException.class, () -> {
            new User("username", invalidPassword, invalidPassword);
        });
    }

    @Test
    public void testValidatePassword_InvalidPassword_NoDigit() {
        String invalidPassword = "Password";
        assertThrows(WrongPasswordException.class, () -> {
            new User("username", invalidPassword, invalidPassword);
        });
    }

    @Test
    public void testValidatePassword_InvalidPassword_NotMatchingConfirmation() {
        String invalidPassword = "Password1";
        String confirmation = "Password2";
        assertThrows(WrongPasswordException.class, () -> {
            new User("username", invalidPassword, confirmation);
        });
    }

}