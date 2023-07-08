public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n+" ");
            return ;
            
        }
        System.out.print(n+" ");
        
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
            
        }printInc(n-1);
        System.out.print(n+" ");
        
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        
        return fn;
    }


    public static int sumToN(int n){
        if(n==1){
            return 1;
        }
        int fnm1=sumToN(n-1);
        int fn=n+fnm1;
        
        return fn;
    }
    public static int fib(int n){
        if(n==1||n==0){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fib(n-1)+fib(n-2);
        
        return fn;
    }

    public static boolean isSorted(int a[],int i){
        if (i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return isSorted(a,i+1);

    }

    public static int firstOccur(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        } 
        
        return firstOccur(arr,key,i+1);
    }
    /*public static int lastOccur(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        } 
        
        return lastOccur(arr,key,i-1);
    }*/
    public static int lastOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccur(arr,key,i+1);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){ //time compelexity=O(n)
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int optimizedPower(int x,int n){   //time complexity=logn
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower( x, n/2)
        //int halfPowerSq=optimizedPower(x,n/2)*optimizedPower(x,n/2); //timeComplexity=O(n) 
        //calling a functuon two times makes the time complexity increase
        int halfPowerSq=halfPower*halfPower;
        if(n%2!=0){
          halfPowerSq= x*halfPowerSq;
        }
        return halfPowerSq;
    }


    

    public static void main(String args[]){
        System.out.println(optimizedPower(2,10));
    }
}
    

