public class PairSumOfGivenNumber{
    public static void findSum(int a[],int givenNumber){
        //int swap=1;
        int b=0;
        int firstNumber=a[0];
        for(int i=1; i<a.length; i++){
            if((firstNumber+a[i])==givenNumber){
                System.out.println("("+firstNumber+","+a[i]+")");
            }
            if(i==a.length-1){
                b++;
                firstNumber=a[b];
                i=b;
            }
        }
    }
    public static void main(String... args){
        findSum(new int[]{0,2,4,1,8,5,3,6,7},8);
    }
}