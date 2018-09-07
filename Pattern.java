public class Pattern{
    public static void main(String... args){
        int n=5;
        int b=1;
        for(int i=0; i<5; i++){
            for(int j=0; j<n; j++){
                System.out.print(" ");
                if(j==n-1){
                    for(int k=0; k<b; k++){
                        System.out.print("*");
                    }
                    n-=1;
                    b+=2;
                }
            }
            System.out.print("\n");
        }
        n=7;
        b=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<n;j++){
                System.out.print(" ");
                    if(j==b){
                        for(int k=0; k<n-2; k++){
                            System.out.println("*");
                        }
                        n-=2;
                        b++;
                    } 
                 
            }
            System.out.print("\n");
        
    }
}
}


