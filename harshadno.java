public class Harshadnumber  
{  
    public static void main(String[] args) {  
        int num = 22;  
        int rem = 0, sum = 0, n;  
          
        
        n = num;  
          
       
        while(num > 0){  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        }  
          
        
        if(n%sum == 0)  
            System.out.println(n + " is a harshad number");  
        else  
            System.out.println(n + " is not a harshad number");  
    }  
}  