package org.iesvdm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class AlturaAlumnoTest {
        @Test
        void verdadero(){
            assertEquals(1, 1);
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

        @Test
        void modificaAlturaTest3(){
            double[] array = new double[10];
            double[] arrayCopy;
            int position = 3;
            double altura = 20;

            arrayCopy = Arrays.copyOf(array,array.length);

            AlturaAlumno.modificaAltura(array,position,altura);

            assertEquals(20,array[3]);
            assertTrue( 0 <= (array.length - position));

            for (int i = 0; i < array.length; i++) {
                if (i != position)
                    assertEquals(array[i],arrayCopy[i]);

            }
        }
        @Test
        void buscaNombreTest(){
            String[] array = new String[] {"ana","pepe","rodrigo"};
            String nombre = "pepe";
            assertEquals(1,AlturaAlumno.buscaNombre(array,nombre));
        }
        @Test
        void buscaNombreTestVacio(){
            String[] array = new String[] {"ana","pepe","rodrigo"};
            assertEquals(-1,AlturaAlumno.buscaNombre(array," "));
            assertEquals(-1,AlturaAlumno.buscaNombre(array,null));
        }
        @Test
        void mostrarTestFallo(){
            String[] arrayNombre = new String[]{"a","b","c"};
            double[] arrayAltura = new double[]{1,2};

            assertThrows(ArrayIndexOutOfBoundsException.class,() -> AlturaAlumno.mostrar(arrayNombre,arrayAltura));
        }
        @Test
        void mostrarTestCorrecto(){
            String[] arrayNombre = new String[]{"a","b","c"};
            double[] arrayAltura = new double[]{1,2,3};

            assertDoesNotThrow(() -> AlturaAlumno.mostrar(arrayNombre,arrayAltura));
        }

        @Test
        void calculaMaximoTest(){
            double[] array = new double[]{1,2,3};

            assertEquals(2,AlturaAlumno.calculaMaximo(array)[0]);
            assertEquals(3,AlturaAlumno.calculaMaximo(array)[1]);
        }
        @Test
        void calculaMediaTest(){
            double[] array = new double[]{0,10};

            assertEquals(5,AlturaAlumno.calculaMedia(array));
        }

    }

