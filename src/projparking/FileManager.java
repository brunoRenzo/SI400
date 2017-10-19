/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projparking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Bruno
 */
public class FileManager {
    public final FileSystem sistArq;
    public final Path arq;
    
    public FileManager(){
        sistArq=FileSystems.getDefault();
        arq=sistArq.getPath("bancoDeDados.txt");
    }
    public String nomeAbsoluto(){
        return arq.toAbsolutePath().toString();
    }
    public Path getPath(){
        return arq;
    }
    public List<Parker> getParkers() throws IOException, ClassNotFoundException{
        
        ObjectInputStream is = new ObjectInputStream(Files.newInputStream(getPath()));
        List<Parker> parkerList = new ArrayList<Parker>();
        int flag=0;
        while(flag==0){
            try{
                //System.out.println("entroooo");
                parkerList.add((Parker)is.readObject());
                //System.out.println(((Parker)is.readObject()).placa);
            }catch(Exception e){
                flag=1;
            }
        }
        System.out.println(parkerList.size());
        return parkerList;
    }
    public Parker getParker(String placa) throws IOException, ClassNotFoundException{
        Parker p = null;
        List<Parker> currentList = new ArrayList<>();
        for(Parker cp:getParkers()){
            System.out.println("ento");
            if((cp.placa).equalsIgnoreCase(placa))
                p=cp;
        }
        return p;
    }
    public void addParker(Parker p) throws IOException, ClassNotFoundException{
        List<Parker> currentList = new ArrayList<>();
        for(Parker cp:getParkers()){
            currentList.add(cp);
        }
        
        ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(arq));
        for(Parker cp:currentList){
            os.writeObject(cp);
        }
        os.writeObject(p);
    }
    public void removeParker(String placa) throws IOException, ClassNotFoundException{
        List<Parker> currentList = new ArrayList<>();
        for(Parker cp:getParkers()){
            if(!(cp.placa).equalsIgnoreCase(placa))
                currentList.add(cp);
        }
        
        ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(arq));
        for(Parker cp:currentList){
            os.writeObject(cp);
        }
    }
}
