package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String lnt = Integer.toString(t);
        int lngth = lnt.length();
        for (int i = 1; i<=lngth;i++){
            int temp = t%(10*(lngth-i));
            sum = sum+temp;

        }
        System.out.println(sum);

    }
}
