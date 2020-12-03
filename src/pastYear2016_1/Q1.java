package pastYear2016_1;


public class Q1 {
    public static void main(String[] args) {
        int[] num = {34, 15, 12, 27, 74, 23}; // error
        int cnt = 0;
        for(int i = 0; i < num.length; i++) // error
            if(isEven(num[i])) // error
                cnt++;
        System.out.println("The number of even number is " + cnt);
        System.out.println("The sum of the array is " + getTotal(num)); // error
    }
    
    public static boolean isEven(int a) { // error
        if(a%2==0) // error
            return true;
        else
            return false;
    }
    
    public static int getTotal(int[] a) { // error
        int total = 0;
        for(int i = 0; i < a.length; i++)
            total += a[i]; // error
        return total;
    }
    
}
