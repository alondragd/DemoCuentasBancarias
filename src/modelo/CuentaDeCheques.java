/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumnos
 */
 
 public class CuentaDeCheques extends cuentaBasica { 
     
     int chequesEmitidos; 
    int chequesRebotados; 
     
        
     
     public CuentaDeCheques(int numeroDeCuenta , String cliente){ 
         super (); 
         this.chequesEmitidos = 0; 
         this.chequesRebotados = 0; 
          
               } 
     public boolean quiereRealizar (int numero){ 
     
        boolean siQuiere = false; 
        if (numero == 1){ 
            siQuiere = true; 
        } 
        return siQuiere; 
    } 
     
      
     public double retirarCheques (double cantidad){ 
         
         double seRealizaRetiro = super.retirar(cantidad); 
          
         
             this.chequesEmitidos++; 
         
          
         return seRealizaRetiro; 
     } 
      
      
     public double calcularComisionPorChequesEmitidos (){ 
         double comisionDeCheque; 
          
         
         if (chequesEmitidos <= 5){ 
             comisionDeCheque = 0; 
             //System.out.println("No tiene comision por el Cheque Emitido"); 
         } else { 
             
            comisionDeCheque = (chequesEmitidos-5)*10.00; 
            //System.out.println("Su comision es: " + comisionDeCheque); 
         } 
          
         return comisionDeCheque; 
      
     } 
  
     
     public double calcularComisionPorChequesRebotados (){ 
          
        double comisionRebote; 
          
         if (chequesRebotados <= 0){ 
             comisionRebote = 0; 
             //System.out.println ("No tiene comision en Rebote de Cheques"); 
          
         }else { 
             comisionRebote = 200.00 * chequesRebotados; 
            // System.out.println("Su comision es: " + comisionRebote ); 
         } 
      
         return comisionRebote; 
      
     } 
      
      
      
     public void realizarCorteMensualDeCheques (){ 
          
          
         this.saldo = saldo - (this.chequesRebotados + this.chequesEmitidos ); 
      
     } 

    
      
     
 } 
