package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AlturaAlumnoTest {
        @Test
        void verdadero(){
            assertTrue(1==1);
        }
        @Test
        void anaideNombreTest1() {
            final String[] array = new String[10];
            array[0] = "jose";
            String nombre = "María";
            String[] arrayActual = AlturaAlumno.añadeNombre(array,nombre);

            assertEquals(nombre,arrayActual[arrayActual.length -1]);
        }

        @Test
        void anaideAlturaTest2() {
            double[] array = new double[10];
            double[] arrayActual = AlturaAlumno.añadeAltura(array);
            assertEquals(1.5,arrayActual[arrayActual.length -1]);

        }
    }

