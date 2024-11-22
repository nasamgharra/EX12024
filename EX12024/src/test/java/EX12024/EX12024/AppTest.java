package EX12024.EX12024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	
	 Question4 check=new Question4();
	 
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void test1() {
    	String ExpectedResult="A";
    	double a=5;
    	double b=2;
    	String mod="regular";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    @Test
    public void test2() {
    	String ExpectedResult="error";
    	double a=15;
    	char b='*';
    	String mod="regular";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    
    @Test
    public void test3() {
    	String ExpectedResult="B";
    	double a=17;
    	double b=-17;
    	String mod="negative";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    @Test
    public void test4() {
    	String ExpectedResult="error";
    	char a='s';
    	double b=-88;
    	String mod="negative";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    
    @Test
    public void test5() {
    	String ExpectedResult="A";
    	double a=0.3;
    	double b=0.6;
    	String mod="reciprocal";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    @Test
    public void test6() {
    	String ExpectedResult="error";
    	double a=1/8;
    	double b=2/0;
    	String mod="reciprocal";
    	String ActualResult=check.comparing(a,b,mod);
    	assertEquals(ExpectedResult,ActualResult);
    	
    }
    
    
    
    
   
}
