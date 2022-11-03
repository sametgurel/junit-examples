import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit4Example extends Junit4Base {
    @Test
    public void xassertEquals() {
        Assert.assertEquals("Değerler eşit değil", "1", "1");
        System.out.println("Pass");

    }

    @Test
    public void bassertNotEquals() {
        Assert.assertNotEquals("Değerler eşit", "2", "1");
        System.out.println("Pass");

    }

    @Test
    public void carrayEquals() {
        String[] array1 = {"Testinium", "Test", "QA"};
        String[] array2 = {"Testinium", "QA", "Test"};

        Arrays.sort(array1);
        Arrays.sort(array2);

        Assert.assertArrayEquals(array1, array2);

        System.out.println("Array karşılaştırması başarılı");
    }

    @Test
    public void darrayNotEquals() {
        String[] array1 = {"Testinium", "Test", "QA"};
        String[] array2 = {"Testinium", "Qa", "Test"};

        Arrays.sort(array1);
        Arrays.sort(array2);

        Assert.assertFalse(Arrays.equals(array1, array2));
        System.out.println("Array karşılaştırması başarılı");
    }

    @Test
    public void eassertListEquals() {
        List<Integer> intList1 = new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(3);

        }};

        List<Integer> intList2 = new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(3);

        }};
        Collections.sort(intList1);
        Collections.sort(intList2);

        Assert.assertEquals("Bu test fail oldu", intList1, intList2);
        System.out.println("List karşılaştırması başarılı");
    }

    @Test
    public void fassertListNotEquals() {
        List<Integer> intList1 = new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(3);

        }};

        List<Integer> intList2 = new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(5);

        }};
        Collections.sort(intList1);
        Collections.sort(intList2);

        Assert.assertNotEquals("Bu test fail oldu", intList1, intList2);
        System.out.println("List karşılaştırması başarılı");
    }

    @Test
    public void gassertTrue() {
        int a = 11;
        Assert.assertTrue("a 1'e eşit değil veya ondan büyük değil", a == 1 || a > 10);
        System.out.println("Pass");
    }

    @Test
    public void hassertFalse() {
        int a = 21;
        Assert.assertFalse("a 4'ten büyük ve 2'ye tam bölünür", a > 4 && (a % 2 == 0));
        System.out.println("Pass");
    }

    @Test
    public void iassertNull(){
        String  a = null;
        Assert.assertNull("Değer null değil", a);
        System.out.println("Pass");

    }

    @Test
    public void jassertNotNull(){
        String  a = "";
        Assert.assertNotNull("Değer null", a);
        System.out.println("Pass");

    }

    @Test
    @Ignore
    public void ktestIgnore(){
        System.out.println("Test Ignored");
    }

}
