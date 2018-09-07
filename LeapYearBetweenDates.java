public class LeapYearBetweenDates{
    public static void main(String... args){
        int startDate=1999;
        int endDate=2018;
        int count=0;
        while(startDate<endDate){
            if((startDate%4)==0){
                count++;
            }
            startDate+=1;
        }
        System.out.println("There are "+count+" leap years");
    }
}