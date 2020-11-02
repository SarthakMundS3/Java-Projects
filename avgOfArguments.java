// Find avg of set of numbers as arguments

public class avgOfArguments {
    static float rec (float ...arr){
        int a = arr.length;
        float sum = 0;
        for (int i = 0; i < a; i++) {
            sum +=arr[i] ;                      
        }
        float avg = sum/ a;
        return avg;
    }
    public static void main(String[] args) {
        
        System.out.println("avg of 1, 2, 3, 4 is : "+ rec(1.0f, 2.0f, 3.0f, 4.0f));
        
    }
}
