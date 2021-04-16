import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class NameValidation {
    private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2}";
    private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2}";
    private static final String EMAIL_TEST_PATTERN = "[a-z]{3}.[a-z]{3}@[a-z]{2}.[a-z]{2}.[a-z]{2}";
    private static final String MOBILENO_TEST_PATTERN = "[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD_TEST_PATTERN ="[A-Z]{1}[A-Za-z0-9,@,+]{8}";
    private static final String TEST_PATTERN ="HAPPY";
    public boolean userValidator(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean givenLastName_it_should_Return_True(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean email(String email) {
        Pattern pattern = Pattern.compile(EMAIL_TEST_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean mobileno(String mobileno) {
    Pattern pattern = Pattern.compile(MOBILENO_TEST_PATTERN);
    return pattern.matcher(mobileno).matches();
    }
    public boolean password(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_TEST_PATTERN);
        return pattern.matcher(password).matches();
    }
    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(TEST_PATTERN);
        return pattern.matcher(name).matches();
    }

}
