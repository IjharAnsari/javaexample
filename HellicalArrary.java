class HellicalArray{
    int a1=0;
    int b1=0;
    int swap;

    public void getHellical(int [][]a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(b1<a.length){
                    a1=i;
                    b1=j;
                }
                if(b1==a.length && a1!=a.length){
                    j=i+1;
                    a1=j;
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
                System.out.println(a[a1][b1]);
            }
        }

    }
    public static void main(String... args){
        HellicalArray ab=new HellicalArray();
        ab.getHellical(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
/**
 * Given array
 * 1    2   3   4
 * 4    5   6   7   
 * 8    9   1   11
 * 12   13  14  15
 * 
 */