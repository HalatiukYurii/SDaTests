import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2018-03-24.
 */
@RunWith(value = Parameterized.class)
public class CalculatorParamatrizedTests {
    @Parameter
public int number ;
    @Parameter(1)
    public int condition;




//    @Parameters(name = "{index} isEven(0)")
//    public static Iterable<? extends Object[]>data(){
//        return Arrays.asList(new Object[][]{
//                {2,true}
//                ,{4,true}
//                ,{6,true}
//                ,{5,false}
//                ,{8,true}
//                ,{10,true}
//                ,{12,true}
//                ,{14,true}
//                ,{16,true}});
//    }
//
//    @Test
//    public void calculatorEven (){
//        assertTrue(new Calculator().isEven(this.number));
//    }

    @Parameters(name = "")
    public static Iterable<? extends Object[]>data(){
        return Arrays.asList(new Object[][]{
                {0,0}
                ,{1,1}
                ,{2,1}
                ,{3,22}});

    }

    @Test
    public void calculatorEven (){
        assertTrue(new Calculator().isEven(this.number));
    }

}
