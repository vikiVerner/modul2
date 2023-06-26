package calculator;

public class SumCalculator {
    public int sum(int n){
        int result = 0;
        if(n!=0){
            for (int i = 1; i <= n ; i++) {
                result+=i;
            }
        }else{
            throw new IllegalArgumentException("Please select number >=1.");
        }

        return result;
    }
}
