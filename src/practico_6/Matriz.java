
package practico_6;

public class Matriz {
   private int arreglo[][]={{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
   
    
    
    public void armar(){
    
        for(int i=0;i<arreglo.length;i++){
            for(int c=0;c<arreglo[i].length;c++){
                if(arreglo[i][c]%2==0)
                System.out.print(arreglo[i][c]+" ");
                }
            System.out.println("");
        
         }
     }
}