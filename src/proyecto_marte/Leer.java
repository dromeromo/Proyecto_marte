/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Andres
 */
public class Leer {
    
    private File documento=null;
    private  FileReader fr=null;
    private BufferedReader br = null;

    public Leer(String cadena) throws FileNotFoundException {
        noExiste(cadena);
       }

    public void noExiste(String archivo) throws FileNotFoundException {// metodo que comprueba que existe el archivo 
        documento = new File(archivo);
        if(documento.exists())
        {
         this.fr = new FileReader(archivo);
         this.br = new BufferedReader(fr);   
        }
        else
        {
            System.out.println("El fichero no existe");
        }
        
    }
    
}
