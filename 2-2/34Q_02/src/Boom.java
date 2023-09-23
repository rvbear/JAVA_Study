import java.util.Scanner;
public class Boom {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(); //Çà
        int m = in.nextInt(); //¿­
        double p = in.nextDouble(); //È®·ü
        String [][] Bomb = new String[n][m]; //Áö·Ú ¼û±è ¿©ºÎ
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                int a = (int)(Math.random()*100+1);
                if(a<100*p){
                    Bomb[i][j]="*";
                }
                else{
                    Bomb[i][j]="_";
                }
            }
        }
        //Áö·Ú ¼û±è ¿©ºÎ Ãâ·Â
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Bomb[i][j]);
            }
            System.out.println();
        }
        //ÁÖº¯ Áö·Ú °è»ê
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                switch (Bomb[i][j]){
                    case "*":
                        System.out.print("*");
                        break;
                    default:
                        int count=0;
                        for(int ii=(i>0)?i-1:0;ii<=i+1&&ii<=n-1;ii++){
                            for(int jj=(j>0)?j-1:0;jj<=j+1&&jj<=m-1;jj++){
                                if(Bomb[ii][jj].equals("*")){
                                    count ++;
                                }
                            }
                        }
                        System.out.print(count);
                        break;
                }
            }
            System.out.println();
        }
        in.close();
    }
}