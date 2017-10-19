/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projparking;

import java.time.LocalDateTime;

/**
 *
 * @author Bruno
 */
public class Parker implements java.io.Serializable{
    
    String modelo;
    String placa;
    String cor;
    String nomeP;
    String contato;
    String vaga;
    LocalDateTime dataHora;
    
    public void setModelo(String setterModelo){
        modelo=setterModelo;
    }
    public void setPlaca(String setterPlaca){
        placa=setterPlaca;
    }
    public void setCor(String setterCor){
        cor=setterCor;
    }
    public void setNomeP(String setterNomeP){
        nomeP=setterNomeP;
    }
    public void setContato(String setterContato){
        contato=setterContato;
    }
    public void setVaga(String setterVaga){
        vaga=setterVaga;
    }
    public void setDataHora(LocalDateTime setterDH){
        dataHora=setterDH;
    }
    
    
    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getCor(){
        return cor;
    }
    public String getNomeP(){
        return nomeP;
    }
    public String getContato(){
        return contato;
    }
    public String getVaga(){
        return vaga;
    }
    public LocalDateTime getDataHora(){
        return dataHora;
    }
}
