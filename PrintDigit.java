public class PrintDigit {
    public static String digits[]={"zero","one","two","three","four","five","six","seven", "eight","nine"};
    public static void printDigit(int num){
        if(num==0){
            return;
        }
        int lstdigit=num%10;
        //System.out.print(digits[lstdigit]+" ");
        printDigit(num/10);
        System.out.print(digits[lstdigit]+" ");
    }
    
    public static int lengthStr(String str){
        if(str.length()==0){
            return 0;
        }
        
        return lengthStr(str.substring(1))+1;
    }
    public static void main(String args[]){
        //printDigit(2345);
        System.out.println(lengthStr("abc"));
    }
    
}
