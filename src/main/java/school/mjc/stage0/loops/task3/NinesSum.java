package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        double temp2 = 0;
        double sum=0;
        for (int i = 0; i<=lengthOfLastNumber ; i++){
            double temp = 9*(Math.pow(10, i));
            temp2 = temp2 + temp;
            sum = sum + temp2;
        }
        System.out.println(Math.round(sum));

    }
}
