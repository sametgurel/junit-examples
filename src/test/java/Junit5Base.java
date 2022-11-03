import org.junit.jupiter.api.*;

public class Junit5Base {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll calisti");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach calisti");

    }

//    @Test
//    public void test1(){
//        System.out.println("Test1 calisti");
//    }
//
//    @Test
//    public void test2(){
//        System.out.println("Test 2 calisti");
//    }
//
//    @Test
//    public void test3(){
//        System.out.println("Test3 calisti");
//    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach calisti");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll calisti");
    }
}
