import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)

public class Junit5Example extends Junit5Base{
    @Order(2)
    @Test
    public void assertEquals(){
        Assertions.assertEquals("1","1","Değerler eşit değil");
        System.out.println("Passed");
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {"kullanıcı1","kullanıcı2","kullanıcı3"})
    public void paramTest(String param){
        System.out.println(param + " login oldu");
    }

    String getUserName(){
        return "Kullanıcı 1<br>";
    }

    @Order(1)
    @Test
    void assertEqualsTest(){
        String userName = getUserName().trim().replaceAll("<br>","");
        Assertions.assertEquals("Kullanıcı 1", userName, "Kullanıcı adı beklenen değer değil.");
        System.out.println("Passed");
    }

}
