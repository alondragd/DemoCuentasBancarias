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
public class cuentaDeAhorro {
int numerodecuenta;
String cliente;
double saldo;
public double saldo2;
double tasaInteres= 0.3287;
public double Interes;
public double comision;
double comisionporsaldo=50;
double cantidad;
double retiro;
public double Interes2;
public double comision2;
public void CuentaDeAhorro (int numerodecuenta, String cliente)
{
this.numerodecuenta=numerodecuenta;
this.cliente=cliente;
}
public double getSaldo()
{
return this.saldo;
}
public double depositar(double deposito)
{
this.cantidad=deposito;
saldo= saldo + cantidad;
return saldo;
}
public boolean retirar (double retirar)
{
boolean xSaldo=true;
this.retiro=retirar;
if(retiro<=saldo)
{
saldo=saldo-retiro;
xSaldo=true;
}
else
{
if (retiro>saldo)
{
xSaldo=false;
}
}
return xSaldo;
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
saldo2=saldo;
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
}