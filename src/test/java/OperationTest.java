import org.junit.Test;


public class OperationTest {


    @Test
    public void test1() {
        Triangle lol = new Triangle();
        lol.setA(1);
        lol.setB(2);
        lol.setC(6);

        if(lol.isTriangle()){
            lol.calculateArea(lol.getType());
        }else{
           throw new IllegalArgumentException("not a trinagle");
        }
    }
    @Test
    public void test2() {
        Triangle lol = new Triangle();
        lol.setA(0);
        lol.setB(1);
        lol.setC(1);

        if(lol.isTriangle()){
            lol.calculateArea(lol.getType());
        }else{
            throw new IllegalArgumentException("not a trinagle");
        }
    }
    @Test
    public void test3() {
    Triangle lol = new Triangle();
        lol.setA(10);
        lol.setB(5);
        lol.setC(4);

        if(lol.isTriangle()){
            lol.calculateArea(lol.getType());
        }else{
            throw new IllegalArgumentException("not a trinagle");
        }
        }

    @Test
    public void test4() {
        Triangle lol = new Triangle();
        lol.setA(10);
        lol.setB(10);
        lol.setC(19);

        if(lol.isTriangle()){
            lol.calculateArea(lol.getType());
        }else{
            throw new IllegalArgumentException("not a trinagle");
        }
    }

}