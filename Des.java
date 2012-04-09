/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richard
 */
public class Des {
private int[][] firstPerm;

    public Des(int[][] f){this.firstPerm=f;}

    public int[][]  permutation()
    {
        int[][] perm = new int[8][8];
       for(int i = 0;i<this.firstPerm.length/2;i++)
        {
            for(int j=0;j<this.firstPerm[i].length;j++)
            {if((j%2==0)){perm[7-i][7-j]=this.firstPerm[i][j];perm[i][j]=this.firstPerm[7-i][7-j];}
            // else  { perm[i][j]=this.firstPerm[i][j];}

                 
             }

            }
        return perm;
        }

    public static void main(String args[])
        {
            int[][] matrice = new int[8][8];
            for(int i = 0;i<matrice.length;i++)
            {
                for(int j=0;j<matrice[i].length;j++)
                { int a=10*i;matrice[i][j]=a+j;  }
                

        }


             Des d = new Des(matrice);
             
             Des d1 = new Des(d.permutation());
             for(int i = 0;i<matrice.length;i++)
            {
                for(int j=0;j<matrice[i].length;j++)
                { System.out.print(matrice[i][j]);  }
                 System.out.println("\t matrice :"+i);

        }

         for(int i = 0;i<matrice.length;i++)
            {
                for(int j=0;j<matrice[i].length;j++)
                { System.out.print("|"+d1.firstPerm[i][j]);  }
                System.out.println("\t ligne :"+i);

        }


     }

}


