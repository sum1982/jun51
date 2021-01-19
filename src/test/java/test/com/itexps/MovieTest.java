/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kohli
 */
public class MovieTest {
    Movie movie;
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
          
    }
    
    @Before
    public void setUp() {
        movie = new Movie();
          
    }
    
    @After
    public void tearDown() {
         
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMovieName() {
    movie.setName("Speed");
        System.out.println("movie=" + movie.getName());
    assertEquals("Speed",movie.getName());
    
    
    movie.setActor("Smith");
          System.out.println("actor=" + movie.getActor());
    assertEquals("Smith",movie.getActor());
   
    movie.setYear("1999");
      System.out.println("year=" + movie.getYear());
        assertEquals("1999",movie.getYear());
    }
}
