import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class JunitTests{
    @Test
    public void testCount1(){
        assertEquals(1, RecursionProblem1.Recursion1(8), "Recursion1(8) should return 1");
    }
    @Test
    public void testCount2(){
        assertEquals(2, RecursionProblem1.Recursion1(818), "Recursion1(818) should return 2");
    }
    @Test
    public void testCount3(){
        assertEquals(4, RecursionProblem1.Recursion1(8818), "Recursion1(8818) should return 4");
    }
}