/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.parly.p2.p5;
import java.util.Scanner;

/** 
 *Parly
 *CECILIA GUTIÉRREZ DE LARA HERNÁNDEZ
 *NORMA LEDEZMA MARTÍNEZ
 *ERICK EDUARDO GERVACCI ROMERO
 *DIEGO SANTANA LEIVA
 *BENITO RAFAEL MORANTE VÁZQUEZ
 */
public class SPP2ParlyP2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamaño=pedirEntero("el tamaño del arreglo");
        int [][] a=Matriz("A",tamaño);
        suma(a);   
    }
    public static int pedirEntero(String mensaje){
        Scanner sc=new Scanner(System.in);
        boolean flag;
        int a=0;
        do{
            try{
                System.out.println("Escriba "+ mensaje);
                a=sc.nextInt();
                flag=false;
            }
            catch(Exception e){
                System.out.println("Error, ingrese entero");
                sc.nextInt();
                flag=true;
            }
        }
        while (flag);
        return a;
    }
    public static int[][] Matriz (String a, int t){
        int[][] Matriz=new int[t][t];
        System.out.println("Tamaño de la Matriz" +Matriz.length);
        for(int i=0; i<Matriz.length; i++){
            for(int j=0; j<Matriz.length; j++){
                Matriz[i][j]=pedirEntero("los valores ["+i+","+j+"]:");
            }
        }
        return Matriz;
    }
    public static int[][] suma(int[][]a){
        int suma;
        int[][] r=new int[a.length][a.length];
        System.out.println("Suma");
        for(int i=0; i<a.length; i++){
            suma=0;
            for(int j=0; j<a.length; j++){
                suma=suma+a[i][j];
                
        }
            System.out.println("La suma de la fila ["+(i+1)+"] es: "+suma );
        }
        System.out.println("");  
        return r;
    }
    
}
