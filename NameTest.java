import org.junit.Assert;
import org.junit.Test;

public class NameTest {
    /**
     * in case we hava to validatre first name by using junit
     * and minimum character should be 3 and first will be capital
     */
    @Test
    public void demoName() {
        NameValidation demoname = new NameValidation();
       boolean result = demoname.userValidator("Ash");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre last name by using junit
     * and minimum character should be 3 and first will be capital
     */
    @Test
    public void givenLastNameIs_valid_should_return_true() {
        NameValidation demoname1 = new NameValidation();
        boolean result = demoname1.givenLastName_it_should_Return_True("Man");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre email address  by using junit
     */
    @Test
    public void givenEmail_Is_valid_Should_return_True() {
        NameValidation validatemail = new NameValidation();
        boolean result = validatemail.email("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre mobile no by using junit
     * and space after 91 8459214148 like
     */

    @Test
    public void givenMobileno_GivesValid_should_Return_true() {
        NameValidation validatemobileno = new NameValidation();
        boolean result = validatemobileno.mobileno("91 8459214148");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre pssword by using junit
     * and minimum 8 character will be there 1st should be capital 1 special charcter and numeric also in password
     */
    @Test
    public void password_Should_Valid_return_true() {
        NameValidation validatepassword = new NameValidation();
       boolean result = validatepassword.password("Ashok@123");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validate happy and sad validate by using junit
     * when we give happy then tts successfully test
     */

    @Test
    public void when_Happy_Itis_Valid_should_Return_True() {
        NameValidation validate = new NameValidation();
        boolean result = validate.validate("HAPPY");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validate happy and sad validate by using junit
     * when we give happy then its failed successfully
     */
    @Test
    public void when_Gives_Sad_it_should_beFaild() {
        NameValidation validate = new NameValidation();
        boolean result = validate.validate("SAD");
        Assert.assertEquals(true,result);
    }
    /**
     * Write a junit parameterized test to validate multiple entry for email address
     * test case
     */

}
