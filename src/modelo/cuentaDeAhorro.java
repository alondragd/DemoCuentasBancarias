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
public class cuentaDeAhorro extends cuentaBasica{ 
    double saldo2;
double tasaInteres= 0.3287;
double Interes;
double comision;
double comisionporsaldo=50;
double cantidad2;
double retiro2;
double Interes2;
double comision2;
public cuentaDeAhorro(double saldo2, double Interes, double comision,
double cantidad2, double retiro2, double Interes2, double comision2, int
numero_de_cuenta, double saldo, double cantidad, double retiro) {

this.saldo2 = saldo2;
this.Interes = Interes;
this.comision = comision;
this.cantidad2 = cantidad2;
this.retiro2 = retiro2;
this.Interes2 = Interes2;
this.comision2 = comision2;
}
public cuentaDeAhorro() {
}
public void CuentaDeAhorro (int numerodecuenta, String cliente)
{
this.numerodecuenta=numerodecuenta;
this.cliente=cliente;
}
public double calcularInteres (double periodo)
{
Interes= (tasaInteres*saldo)/100;
Interes=Interes*periodo;
return Interes;
}
public double calcularcomisionporsaldo(double periodo)
{
if(saldo<1000)
{
comision = comisionporsaldo*periodo;
}
else
{
if(saldo>=1000)
{
comision=0;
}
}
return comision;
}
public double cortemensual ()
{
//saldo2=saldo;
Interes2=(tasaInteres*saldo)/100;
if(saldo<1000)
{
comision2 = comisionporsaldo;
}
else
{
if(saldo>=1000)
{
comision2=0;
}
}
saldo=saldo+Interes2;
saldo=saldo-comision2;
return saldo;
}

    boolean quiereRealizar(int prueba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcularInteres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double comisionPorSaldo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}