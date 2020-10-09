package mipaquete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlumnoTest {

    private Alumno alumno = new Alumno("Pepe");

    @Test
    void getNombre() {
        Alumno alumno = new Alumno("Pepe");
        assertEquals("Pepe",alumno.getNombre());
    }

    @Test
    void setNombre() {
        Alumno alumno = new Alumno("Pepe");
        alumno.setNombre("Juan");
        assertEquals("Juan",alumno.getNombre());
    }

    @Test
    void testToString(){
        assertEquals("Alumno{nombre='Pepe'}",alumno.toString());
    }

}