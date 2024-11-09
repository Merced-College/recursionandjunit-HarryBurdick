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
    @Test
    public void CountHi1(){
        assertEquals(1, RecursionProblem2.Recursion2("xxhixx"));
    }
    @Test
    public void CountHi2(){
        assertEquals(1, RecursionProblem2.Recursion2("xhixhix"));
    }
    @Test
    public void CountHi3(){
        assertEquals(1, RecursionProblem2.Recursion2("hi"));
    }
    @Test
    public void CountxHi1(){
        assertEquals(1, RecursionProblem2.Recursion3("ahixhi"));
    }
    @Test
    public void CountxHi2(){
        assertEquals(2, RecursionProblem2.Recursion3("ahibhi"));
    }
    @Test
    public void CountxHi3(){
        assertEquals(0, RecursionProblem2.Recursion3("xhixhi"));
    }
    @Test
    public void CountSub1(){
        assertEquals(2, RecursionProblem2.Recursion4("catcowcat", "cat"));
    }
    @Test
    public void CountSub2(){
        assertEquals(1, RecursionProblem2.Recursion4("catcowcat", "cow"));
    }
    @Test
    public void CountSub3(){
        assertEquals(0, RecursionProblem2.Recursion4("catcowcat", "dog"));
    }
    @Test
    public void CountChar1(){
        assertEquals("yza", RecursionProblem2.Recursion5("yyzzza"));
    }
    @Test
    public void CountChar2(){
        assertEquals("abcd", RecursionProblem2.Recursion5("abbbcdd"));
    }
    @Test
    public void CountChar3(){
        assertEquals("Helo", RecursionProblem2.Recursion5("Hello"));
    }
}