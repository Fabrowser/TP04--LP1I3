/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp04;

import java.text.ParseException;

/**
 *
 * @author fabri
 */
public class Tp04 {

    public static void main(String[] args) throws ParseException {
        
        int day=0; 
        int month=0; 
        int year=0;
        
        Data data = new Data (day , month, year);
        
        data.entraDia();
        data.entraMes();
        data.entraAno();
      
        System.out.println(data.mostra1());
        System.out.println(data.mostra2());
      
        if(data.bissexto()){
         System.out.println("ANO BISSEXTO!");
        }else{
         System.out.println("NÃO É ANO BISSEXTO!");
        }
         System.out.println("DIAS ENTRE AS DATAS: " + data.diasTranscorridos());
         
         data.apresentaDataAtual();
        
       }
    
    
}


