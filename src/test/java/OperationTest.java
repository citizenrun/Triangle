import org.junit.Test;


public class OperationTest {


    @Test
    public void test1() {
        Triangle lol = new Triangle();
        lol.a = 1;
        lol.b = 2;
        lol.c = 6;

        if(lol.checkIfTriangle()){
            lol.calculateSquare(lol.checkTringleType());
        }else{
            System.out.println("Fuck");
            System.out.println("=====================");
        }
    }
    @Test
    public void test2() {
        Triangle lol = new Triangle();
        lol.a = 0;
        lol.b = 1;
        lol.c = 1;

        if(lol.checkIfTriangle()){
            lol.calculateSquare(lol.checkTringleType());
        }else{
            System.out.println("Fuck");
            System.out.println("=====================");
        }
    }
    @Test
    public void test3() {
    Triangle lol = new Triangle();
        lol.a = 10;
        lol.b = 5;
        lol.c = 14;

        if(lol.checkIfTriangle()){
            lol.calculateSquare(lol.checkTringleType());
        }else{
            System.out.println("Fuck");
            System.out.println("=====================");
        }
    }
    @Test
    public void test4() {
        Triangle lol = new Triangle();
        lol.a = 10;
        lol.b = 10;
        lol.c = 19;

        if(lol.checkIfTriangle()){
            lol.calculateSquare(lol.checkTringleType());
        }else{
            System.out.println("Fuck");
            System.out.println("=====================");
        }
    }

}