import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JunitTests {
    @Test
    public void testCount1() {
        assertEquals(1, RecursionProblems.Recursion1(8));
    }

    @Test
    public void testCount2() {
        assertEquals(2, RecursionProblems.Recursion1(818));
    }

    @Test
    public void testCount3() {
        assertEquals(4, RecursionProblems.Recursion1(8818));
    }

    @Test
    public void testCount4() {
        assertEquals(6, RecursionProblems.Recursion1(88188));
    }

    @Test
    public void testCount5() {
        assertEquals(9, RecursionProblems.Recursion1(88888));
    }

    @Test
    public void testCount6() {
        assertEquals(1, RecursionProblems.Recursion1(12345678));
    }

    @Test
    public void testCount7() {
        assertEquals(0, RecursionProblems.Recursion1(123456790));
    }

    @Test
    public void CountHi1() {
        assertEquals(1, RecursionProblems.Recursion2("xxhixx"));
    }

    @Test
    public void CountHi2() {
        assertEquals(1, RecursionProblems.Recursion2("xhixhix"));
    }

    @Test
    public void CountHi3() {
        assertEquals(1, RecursionProblems.Recursion2("hi"));
    }

    @Test
    public void CountHi4() {
        assertEquals(0, RecursionProblems.Recursion2("xxxx"));
    }

    @Test
    public void CountHi5() {
        assertEquals(3, RecursionProblems.Recursion2("hihihi"));
    }

    @Test
    public void CountxHi1() {
        assertEquals(1, RecursionProblems.Recursion3("ahixhi"));
    }

    @Test
    public void CountxHi2() {
        assertEquals(2, RecursionProblems.Recursion3("ahibhi"));
    }

    @Test
    public void CountxHi3() {
        assertEquals(0, RecursionProblems.Recursion3("xhixhi"));
    }

    @Test
    public void CountxHi4() {
        assertEquals(0, RecursionProblems.Recursion3("xhixxxxhi"));
    }

    @Test
    public void CountxHi5() {
        assertEquals(2, RecursionProblems.Recursion3("hihixxhi"));
    }

    @Test
    public void CountSub1() {
        assertEquals(2, RecursionProblems.Recursion4("catcowcat", "cat"));
    }

    @Test
    public void CountSub2() {
        assertEquals(1, RecursionProblems.Recursion4("catcowcat", "cow"));
    }

    @Test
    public void CountSub3() {
        assertEquals(0, RecursionProblems.Recursion4("catcowcat", "dog"));
    }

    @Test
    public void CountSub4() {
        assertEquals(2, RecursionProblems.Recursion4("appaaaapp", "app"));
    }

    @Test
    public void CountSub5() {
        assertEquals(2, RecursionProblems.Recursion4("dogbowdogdog", "dog"));
    }

    @Test
    public void CountChar1() {
        assertEquals("yza", RecursionProblems.Recursion5("yyzzza"));
    }

    @Test
    public void CountChar2() {
        assertEquals("abcd", RecursionProblems.Recursion5("abbbcdd"));
    }

    @Test
    public void CountChar3() {
        assertEquals("Helo", RecursionProblems.Recursion5("Hello"));
    }

    @Test
    public void CountChar4() {
        assertEquals("abcd", RecursionProblems.Recursion5("abcd"));
    }

    @Test
    public void CountChar5() {
        assertEquals("uibcd", RecursionProblems.Recursion5("uuiiibcdd"));
    }

    @Test
    public void CountChar6() {
        assertEquals("ababababababa", RecursionProblems.Recursion5("abbbababaabbbbbababaaa"));
    }
}