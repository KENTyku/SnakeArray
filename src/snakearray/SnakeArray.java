/*
 * Use and copying for commercial purposes 
 * only with the author's permission
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
        int [] ar;        
        
        //запрос числа
        System.out.println("Введите положительное целое число");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        
        //формируем массив
        ar=new int[n*n];
        for (int i=0;i<n*n;i++){
            ar[i]=i+1;
        }    
        
        //работаем через матрицу n*n
        int count; 
        int vitok;//номер витка
        int gor1;//индексы верхней горизонтали витка
        int vert1;//индексы правой вертикали витка
        int gor2;//индексы нижней горизонтали витка
        int vert2;//индексы левой вертикали витка
        int i,j;
        int[][] a=new int[n][n];

        count=0;
//          цикл количества обходов (витков спирали}
        for (vitok=0;vitok<(n/2);vitok++) {
        
//          цикл верхней горизотальной части витка
            for(gor1=vitok;gor1<n-1-vitok;gor1++){
                a[vitok][gor1]=ar[count];//передаем значения из массива в матрицу
                count++;
            }
//          цикл правой вертикальной части витка  
            for(vert1=vitok;vert1<n-1-vitok;vert1++){
                a[vert1][((n-1)-vitok)]=ar[count];//передаем значения из массива в матрицу
                count++;
            }
//          цикл, нижней горизонтальной части витка   
          for (gor2=((n-1)-vitok); gor2>vitok;gor2--){
              a[((n-1)-vitok)][gor2]=ar[count];//передаем значения из массива в матрицу
              count++;
          }
//          цикл, левой вертикальной части витка  
          for (vert2=(n-1-vitok);vert2>vitok;vert2--){
              a[vert2][vitok]=ar[count];
              count++;
          }
        }
        
         //учитываем неполный виток 
        if(n%2==1){
            a[(n/2)][n/2]=n*n;
        }
     
        //вывод результата в консоль
        for (i=0;i<n;i++){

            for (j=0;j<n;j++){
                //учитываем форматирование для малых и больших чисел матрицы
                System.out.printf("%"+(n/10+2)+"d",a[i][j]); 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
