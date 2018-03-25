import org.junit.Test;


public class OperationTest {


    @Test
    public void test1() {
        new Triangle(2, 3, 2.6);
    }

    @Test
    public void test2() {
        new Triangle(0, 10, 10);
    }

    @Test
    public void test3() {
        new Triangle(5, 2, 4);

    }

    @Test
    public void test4() {
        new Triangle(20, 10, 10);

    }

    @Test
    public void test5() {
        new Triangle(40, 10, 30);

    }

    @Test
    public void test6() {
        new Triangle(45, 45, 45);

    }

    @Test
    public void test7() {
        new Triangle(0.5, 0.6, 2);

    }
}