/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projparking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class Taxing implements Serializable{
    public final FileSystem sistArq;
    public final Path arq;
    
    public Taxing(){
        sistArq=FileSystems.getDefault();
        arq=sistArq.getPath("bancoDeDadosT.txt");
    }
    public String nomeAbsoluto(){
        return arq.toAbsolutePath().toString();
    }
    public Path getPath(){
        return arq;
    }
    
    float[] taxes = new float[4];
    
    public void setTaxes(float[] setterTaxes){
        for(int i=0;i<4;i++)
        {
            taxes[i]=setterTaxes[i];
        }
    }
    public float[] getTaxes(){
        return taxes;
    }
    public void save() throws IOException{
        ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(getPath()));
        os.writeObject(taxes);
    }
    public float[] load() throws IOException{
        ObjectInputStream is = new ObjectInputStream(Files.newInputStream(getPath()));
        float[] a =null;
        try {
            a = (float[])is.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Taxing.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    
    
}
