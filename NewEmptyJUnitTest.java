import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NewEmptyJUnitTest {
    
    Integrante operacion1 = new Integrante();
    @Test
    public void testAlumno1(){
        assertEquals(2, operacion1.metodo(2, 6));
    }
    @Test
    public void testAlumno2(){
        assertEquals(2, operacion1.metodo(2, 3));
    }
    public void testMaestro1(){
        assertEquals(1, operacion1.metodo(1, 34));
    }
    @Test
    public void testMaestro2(){
        assertEquals(1, operacion1.metodo(1, 54));
    }
    //--------------------------------------------------------------------------
    
    public void testAlumno3(){
        assertEquals(2, operacion1.metodo(1, 6));
    }
    @Test
    public void testAlumno4(){
        assertEquals(2, operacion1.metodo(4, -3));
    }
    public void testMaestro3(){
        assertEquals(1, operacion1.metodo(7, 1));
    }
    @Test
    public void testMaestro4(){
        assertEquals(1, operacion1.metodo(8, 0));
    }
    
    
    
    public NewEmptyJUnitTest() {
    }
}