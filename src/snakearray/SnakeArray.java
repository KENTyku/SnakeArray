/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakearray;

import java.util.Scanner;

/**
 *
 * @author Yuri Tveritin
 * @version 1.0
 */
public class SnakeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n;
        
        System.out.println("Введите положительное целое число");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int [] ar=new int[n*n];
        for (int i=0;i<n*n;i++){
            ar[i]=i+1;
        }
        
        for (int i=0;i<n*n;i++){
            System.out.print(ar[i]);
        }
        System.out.println();
        int[][] a=new int[n][n];
        int count;
        int vitok;
        int gor1;
        int vert1;
        int gor2;
        int vert2;
        int i,j;
       
//        System.out.println((N+1)/2);
        count=0;
//          {цикл, который отвечает за количество витков спирали}
        for (vitok=0;vitok<(n/2);vitok++) {
        
//          {цикл, верхней горизотальной части витка}
            for(gor1=vitok;gor1<n-1-vitok;gor1++){
                a[vitok][gor1]=ar[count];
                count++;
            }
//          {цикл, правой вертикальной части витка (той, что сверху вниз)}  
            for(vert1=vitok;vert1<n-1-vitok;vert1++){
                a[vert1][((n-1)-vitok)]=ar[count];
                count++;
            }
//          {цикл, нижней горизонтальной части витка (той, что справа налево)}  
          for (gor2=((n-1)-vitok); gor2>vitok;gor2--){//g3:=((N+1)-vitok) downto vitok+1 do
              a[((n-1)-vitok)][gor2]=ar[count];
              count++;
          }
//          {цикл, левой вертикальной части витка (той, что снизу вверх)}  
          for (vert2=(n-1-vitok);vert2>vitok;vert2--){//(g4:=((N+1)-vitok) downto vitok+1 do
              a[vert2][vitok]=ar[count];
              count++;
          }
        }
        
         //учитываем неполный виток 
        if(n%2==1){
            a[(n/2)][n/2]=n*n;
        }
     
      for (i=0;i<n;i++){
      
        for (j=0;j<n;j++){
          System.out.printf("%"+(n/10+2)+"d",a[i][j]);
          System.out.print("  ");
        }
        System.out.println();
      }
    }
    
}
