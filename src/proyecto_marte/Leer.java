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
    
    public File documento=null;
    public FileReader fr=null;
    public BufferedReader br = null;

    public Leer(String archivo) throws FileNotFoundException {
        this.documento = new File(archivo);
        this.fr = new FileReader(archivo);
        this.br = new BufferedReader(fr);
       }
    
}
