/*Calcular una medida dada en metros a su equivalente en: centímetros, kilómetros, pulgadas. 
Sabiendo que: 1000 m = 1 km, 100 cm = 1 m, 2.54 cm = 1 pulgada. */

public class Convertidor{
private double km, cm, inch, m;

public Convertidor(double m){
this.m=m;
}
public double getKm(){
km=0;
km=m/1000;
return km;
}

public double getCm(){
cm=0;
cm=m*100;
return cm;
}

public double getInch(){
inch=0;
inch=(m*100)/2.54;
return inch;
}

public void showMedidas(double m, double km, double cm, double inch){
System.out.printf("la medida en m: %.2f\n sería %.2f en km\n %.2f en cm\n y %.2f en inches", m, km, cm, inch );
}
}

