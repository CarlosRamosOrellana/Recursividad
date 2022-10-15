/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RECURSIVIDAD;

/**
 *
 * @author CARLOS
 */
//Crea un método que obtenga la cantidad de dígitos de un número N. Se debe pasar como parámetro el número N
public class Ejercio04 {
   {
    int n = 1111;
    System.out.println(n+" tiene "+digi(n)+" dígitos");
}
//método que devuelve la cantidad de dígitos de num, num debe ser positivo
//ejemplo: num = 1111 -> 4
//ejemplo: num = 45895 -> 5
static int digi(int num)
{
    if(num<=0) return 0;
    return 1 + digi(num/10); 
}
}