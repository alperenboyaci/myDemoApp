package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.*;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().positiveDiffInList(array,8,6));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().positiveDiffInList(array,13,6));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().positiveDiffInList(array,1,1));
    }
    public void testNull() {
      assertFalse(new App().positiveDiffInList(null, 1,5));
    }
    public void testNegativeDifference() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

      assertFalse(new App().positiveDiffInList(array,1,3));
    }


}
