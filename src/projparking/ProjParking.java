/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projparking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class ProjParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        IndexFrame iFrame = new IndexFrame();
        iFrame.setVisible(true);
        FileManager fm = new FileManager();
        
       

    }
    
}
