import org.junit.*;

public class Junit4Base {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass method çalıştı");
    }

    @Before
    public void before(){
        System.out.println("Before method çalıştı");
    }

//    @Test
//    public void test1(){
//        System.out.println("Test1 çalıştı");
//    }
//
//    @Test
//    public void test2(){
//        System.out.println("Test2 çalıştı");
//    }
//
//    @Test
//    public void test3(){
//        System.out.println("Test3 çalıştı");
//    }

    @After
    public void after(){
        System.out.println("After method çalıştı");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass method çalıştı");
    }


}
