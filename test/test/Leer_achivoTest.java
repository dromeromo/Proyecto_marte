/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import proyecto_marte.Leer;
import org.testng.annotations.Test;


/**
 *
 * @author Andres
 */
public class Leer_achivoTest {
    
    @Test
    public void leerTest() throws FileNotFoundException
    {
        Leer leer = new Leer("C:/Users/Andres/");
        
    }
    
    
}
