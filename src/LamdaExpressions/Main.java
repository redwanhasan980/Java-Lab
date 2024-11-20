package LamdaExpressions;

public class Main {
    public static void main(String[] args) {
        num n1 = (n)->{
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=i;
            }
            return sum;
        };
        System.out.println(n1.func(3));
    }
}
