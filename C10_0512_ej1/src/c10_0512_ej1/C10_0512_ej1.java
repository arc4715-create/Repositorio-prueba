/*
Autor: Huayta Mamani Carlos Joel
 */
package c10_0512_ej1;
import java.util.Scanner;
public class C10_0512_ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese cantidad de pruebas");
        int n = leer.nextInt(); 
        for(int i=0;i<=n;i++){
            int f = 1;
            System.out.println(" Número a calcular Factorial");
            int num = leer.nextInt(); 
            if(num==0){
                f=1;
            }
            else if(num>0){
                for(int j=0;j<=num;j++ ){
                    f=f*-1;
                }
            }
            else{
                num=num*-1;
                for(int k=0;k<=n;k++){
                    f=f*k;
            }
                f=f*-1;
            }
            System.out.println("Factorial:"+f);
        }
    }
}
