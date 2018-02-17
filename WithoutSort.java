class WithoutSort{
    public static void withoutSort(int x[], int var){
        int max=x[0];
        int swap=0;
        for(int i=0; i<x.length; i++){
            for(int j=i; j<x.length; j++){
                if(x[i]<x[j]){
                    //swap
                    swap=x[j];
                    x[j]=x[i];
                    x[i]=swap;
                }
            }
            if(i==var){
                System.out.println("Third highest"+x[i]);
                break;
            }
        }
      
            //System.out.println(max);
    }
    public static void main(String... args){
        //which highest you want to find. Simply assinged the value in variable.
        //if you want to find third highest then put int var=2, like
        int var=2;
        withoutSort(new int[]{5,500,4,1,100,8,9,10,11,47},var);
    }
}
