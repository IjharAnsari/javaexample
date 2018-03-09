/**
 * This program form a combination of elements in a array which will yeild 
 * maximum number of all the subset of this array
 */

import java.lang.Math;
class NumConcLarge{
    public static void numConc(int x[]){
        int min=0;
        int max=0;
        int min1=0;
        int max1=0;
        int swap=0;
        int len=0;
        int len1=0;
        int loopCount=0;
        int a=0;
        int rema=0;
        int rem=0;

        //Main logic
        for(int i=0; i<x.length; i++){
            for(int j=i+1; j<x.length;j++){
                
                len=String.valueOf(x[i]).length();
                len1=String.valueOf(x[j]).length();
                if((len==1 && len1>1)){
                    min=x[j]/((int)Math.pow(10,len1-1));
                    max=x[i];
                    a=len1-len;
                    if(max<min){
                        swap=x[j];
                        x[j]=x[i];
                        x[i]=swap;
                    }else if(max==min){
                        rem=x[j]/((int)Math.pow(10,len1-2));
                        rema=rem%10;
                        if(max<rema){
                            swap=x[j];
                            x[j]=x[i];
                            x[i]=swap;
                        }else{
                            continue;
                        }
                    }else{
                        continue;
                    }
                }
                if(len>1 && len1==1){
                    min=x[i]/((int)Math.pow(10,len-1));
                    max=x[j];
                    if(min<max){
                        swap=x[j];
                        x[j]=x[i];
                        x[i]=swap;
                    }else if(min==max){
                        rem=x[i]/((int)Math.pow(10,len-2));
                        rema=rem%10;
                        if(rema<max){
                            swap=x[j];
                            x[j]=x[i];
                            x[i]=swap;
                        }else{
                            continue;
                        }
                    }else{
                        continue;
                    }
                }else
                if(len==len1){
                    if(x[i]<x[j]){
                        swap=x[j];
                        x[j]=x[i];
                        x[i]=swap;
                    }else{
                        continue;
                    }
                }else
                if(len<len1){
                    a=len1-len;
                    int it=(int)Math.pow(10,a);
                    min=x[j]/((int)Math.pow(10,len1-1));
                    max=x[i]/((int)Math.pow(10,len-1));
                    if(min>max){
                        swap=x[j];
                        x[j]=x[i];
                        x[i]=swap;
                    }else if(min==max){
                        min1=x[j]/it;
                        max1=x[i];
                        if(min1>max1){
                            swap=x[j];
                            x[j]=x[i];
                            x[i]=swap;
                        }else if(min1==max1){
                            swap=x[j];
                            x[j]=x[i];
                            x[i]=swap;
                            
                        }else{
                            continue;
                        }
                    }else{
                        continue;
                    }
                }    
                else{
                    a=len-len1;
                    int it=(int)Math.pow(10,a);
                    min=x[i]/((int)Math.pow(10,len-1));;
                    max=x[j]/((int)Math.pow(10,len1-1));;
                    if(min<max){
                        swap=x[j];
                        x[j]=x[i];
                        x[i]=swap;
                    }else if(min==max){
                        min1=x[i]/it;
                        max1=x[j];
                        if(min1<max1){
                            swap=x[j];
                            x[j]=x[i];
                            x[i]=swap;
                        }else if(min1==max1){
                            swap=x[i];
                            x[i]=x[j];
                            x[j]=swap;
                        }else{
                            continue;
                        }
                    }
                }
                
            }
                   
                
            //print the maximum concatinated value formed by elements of array x[];
            }
            for(int jj:x){
                System.out.print(jj+" ");
            }
            System.out.println();
        }
    //main function
    public static void main(String... args){
        numConc(new int[]{54,548,556,60,7,780});
    }
}
