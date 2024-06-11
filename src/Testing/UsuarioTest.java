package Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
    }

    @Test
    void establecerYObtenerNombre() {
        usuario.establecerNombre("Juan");
        assertEquals("Juan", usuario.obtenerNombre());
    }

    @Test
    void establecerYObtenerEdad() {
        usuario.establecerEdad(25);
        assertEquals(25, usuario.obtenerEdad());
    }

    @Test
    void establecerEdadNegativaDeberiaLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> usuario.establecerEdad(-5));
    }
}

class Usuario {
    private String nombre;
    private int edad;

    String obtenerNombre() {
        return nombre;
    }

    void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    int obtenerEdad() {
        return edad;
    }

    void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
}
