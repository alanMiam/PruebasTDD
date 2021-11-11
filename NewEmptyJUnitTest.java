import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NewEmptyJUnitTest {
    Integrante integrante = new Integrante();
    @Test
    public void testAlumno1(){
        assertEquals("Alumno", integrante.metodo(2, 1000));
    }
    @Test
    public void testAlumno2(){
        assertEquals("Alumno", integrante.metodo(2, 2043));
    }
    public void testMaestro1(){
        assertEquals("Maestro", integrante.metodo(1, 454));
    }
    @Test
    public void testMaestro2(){
        assertEquals("Maestro", integrante.metodo(1, 432));
    }
    //--------------------------------------------------------------------------
    
    public void testAlumno3(){
        assertEquals("Alumno", integrante.metodo(1, 6));
    }
    @Test
    public void testAlumno4(){
        assertEquals("Alumno", integrante.metodo(4, -3));
    }
    public void testMaestro3(){
        assertEquals("Maestro", integrante.metodo(7, 1));
    }
    @Test
    public void testMaestro4(){
        assertEquals("Maestro", integrante.metodo(8, 0));
    }

    public NewEmptyJUnitTest() {
    }
}
