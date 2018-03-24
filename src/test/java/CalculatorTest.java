import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

/**
 * Created by RENT on 2018-03-24.
 */
@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();




    @Before
    public void setUp(){
       calculator= new Calculator();
    }

    @Test
    public void calculatorAdd() {
//        Arrange
         double expected = 8;
//        Act
        double actual = calculator.add(5,3);
//        Assert
        assertEquals(expected,actual,0.1);
    }
    @Test
    public void calculatorMnoz() {
//        Arrange
        double expected = 6;
//        Act
        double actual = calculator.mnoz(2,3);
//        Assert
        assertEquals(expected,actual,0.1);
    }
    @Test
    public void calculatorDziel() {
//        Arrange
        double expected = 5;
//        Act
        double actual = calculator.dziel(10,2);
//        Assert
        assertEquals(expected,actual,0.1);
    }
    @Test
public void calculatorDivideByZero(){
        assertThatThrownBy(()->{calculator.dziel(16,0);})
                .hasMessage("boom");

    }
    @Test
    public void fibonacjegoTest(){
        int expected = 377;
        int actual=calculator.fibonacjego(14);
        assertEquals(expected,actual,0.2);
    }

    @Test
    @Parameters({"0,0","1,1","2,1","3,2"})
    public void calculatorFibonacci(int number,int expected){
        assertEquals(expected,this.calculator.fibonacjego(number));

    }



}
