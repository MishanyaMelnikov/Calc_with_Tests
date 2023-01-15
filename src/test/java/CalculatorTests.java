import org.junit.jupiter.api.*;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void BeforeEach(){
        sut = Calculator.instance.get();
    }

    @AfterEach
    public void AfterEach(){
        sut = null;
    }


    @Test
    public void Plus(){

        int a = 4, b = 10, expected = 14;

        int actual = sut.plus.apply(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Minus(){

        int a = 14, b = 10, expected = 4;

        int actual = sut.minus.apply(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Devide(){

        int a = 10, b = 3, expected = 3;

        int actual = sut.devide.apply(a,b);

        Assertions.assertEquals(expected, actual);
    }

}
