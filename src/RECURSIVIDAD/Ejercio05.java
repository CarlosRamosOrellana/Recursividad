/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RECURSIVIDAD;

/**
 *
 * @author CARLOS
 */
//Crea un método que obtenga el factorial de un número N. Se debe pasar como parámetro el número N
public class Ejercio05 {
    {
    //obtier factorial de n
    int n = 4;
    System.out.println(n+"! = "+fact(n));
}
//método que devuelve el factorial de n
//ejemplo: n = 4 -> 4x3x2x1
static int fact(int n)
{
    if(n>1) return n * fact(n-1);
    else return 1;
}
}
