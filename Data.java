/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tp04;
import java.text.DateFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;




/**
 *
 * @author fabri
 */



public class Data {
    
    private int dia;
    private int mes; 
    private int ano;
    private Date dataDigitada;


    Data(int d, int m, int a){
        
       dia = d;
       mes = m;
       ano = a;  
    }

    public void entraDia(){
  
             int d = 0;
                
                while(dia<1 | dia>31){
                System.out.println("Digite o dia:  ");
                Scanner scan= new Scanner(System.in);
                d = scan.nextInt();
                entraDia(d);
            }
    }
    
    public void entraMes(){
            int m = 0;
            while(mes<1 | mes>12){
                System.out.println("Digite o mês:  ");
                Scanner scan= new Scanner(System.in);
                m  = scan.nextInt();
                entraMes(m);
            }
    }
    
       public void entraAno(){
            int a = 0;
            while(a<1){
                System.out.println("Digite o Ano:  ");
                Scanner scan= new Scanner(System.in);
                a = scan.nextInt();
                entraAno(a);
            }
    }
  
    public void entraDia(int d){
       
       dia = d;
     }
    
    public void entraMes(int m){
       
       mes = m;
     }
    
    public void entraAno(int a){
       
       ano = a;
     }    
    
    public int retDia(){
        
          
        return dia; 
    
    }
    public int retMes(){
        
          
        return mes; 
    
    }
    public int retAno(){
        
          
        return ano; 
    
    }
    
    public String mostra1(){
        
        String d = "";
        String m = "";
        String a = "";
                
        return dia + "/" + mes + "/" + ano;

    }
    
    public String mostra2(){
    
        String d = "";
        String m = "";
        String a = "";
        
        switch(mes){
    
        case 1:
            m = "janeiro";
            break;
        case 2:
            m = "Fevereiro";
            break;
        case 3:
            m = "Março";
            break;
        case 4:
            m = "Abril";
            break;
        case 5:
            m = "Maio";
            break;
        case 6:
            m = "Junho";
            break;
        case 7:
            m = "Julho";
            break;
        case 8:
            m = "Agosto";
            break;
        case 9:
            m = "Setembro";
            break;
        case 10:
            m = "Outubro";
            break;
         case 11:
            m = "Novembro";
            break;
         case 12:
            m = "Dezembro";
            break;
        default:
        break;

    }

        return dia + "/" + m + "/" + ano;

    }
    
   public boolean bissexto(){

       //Testa se o ANO é bissexto;
       boolean teste = false;
 
        if (ano % 4 == 0){
            if(ano%100 ==0){
                if(ano%400 ==0){
                    teste = true;
                 } else{
                    teste = false;
                  }
                  } else {
                    teste = true;
                         }
                    }else{
                    teste = false;
        }

       return teste;

    }
   

   public long diasTranscorridos() throws ParseException { 
       
       LocalDate hoje = LocalDate.now();
       LocalDate digitado  = LocalDate.of(ano, mes, dia);
       
       long p2 = ChronoUnit.DAYS.between(digitado, hoje);
       
       return p2;

       
   }
   
   public void apresentaDataAtual(){
       
   Date dt = new Date();
   DateFormat dateFormat;
   
   dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
   
    System.out.println("Data Atual: " + dateFormat.format(dt));
     
   }
   
   
   
   public Date getDataDigitada(){
  
       return dataDigitada;
   }
   
   
  /* public int diasTranscorridos(){
       DateTime dataInicial = new DateTime(dataDigitada);
       DateTime dataFinal = new DateTime(hoje);
       
       int dias = Days.daysBetween(dataDigitada,hoje);
       return dias;
   }*/

    
    
}
