/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakearray;

/**
 *
 * @author user
 */
public class SnakeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N=8;
        int [] ar=new int[N*N];
        int[][] a=new int[N][N];
        int count;
        int vitok;
        int gor1;
        int vert1;
        int gor2;
        int vert2;
        int i,j;
//        System.out.println((N+1)/2);
        count=1;
//          {цикл, который отвечает за количество витков спирали}
        for (vitok=0;vitok<((N+1)/2);vitok++) {
        
//          {цикл, верхней горизотальной части витка}
            for(gor1=vitok;gor1<N-1-vitok;gor1++){
                a[vitok][gor1]=count;
                count++;
            }
//          {цикл, правой вертикальной части витка (той, что сверху вниз)}  
            for(vert1=vitok;vert1<N-1-vitok;vert1++){
                a[vert1][((N-1)-vitok)]=count;
                count++;
            }
//          {цикл, нижней горизонтальной части витка (той, что справа налево)}  
          for (gor2=((N-1)-vitok); gor2>vitok;gor2--){//g3:=((N+1)-vitok) downto vitok+1 do
              a[((N-1)-vitok)][gor2]=count;
              count++;
          }
//          {цикл, левой вертикальной части витка (той, что снизу вверх)}  
          for (vert2=(N-1-vitok);vert2>vitok;vert2--){//(g4:=((N+1)-vitok) downto vitok+1 do
              a[vert2][vitok]=count;
              count++;
          }
        }
     
      for (i=0;i<N;i++){
      
        for (j=0;j<N;j++){
          System.out.print(a[i][j]);
          System.out.print("  ");
        }
        System.out.println();
      }
    }
    
}
