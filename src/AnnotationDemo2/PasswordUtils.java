package AnnotationDemo2;

public class PasswordUtils {

    @UseCase(id=47,description = "Password must contain at least on numeric")
    public boolean validatePasword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id=48)
    public String encryptPassword(String password){
        return new StringBuffer(password).reverse().toString();
    }
}
