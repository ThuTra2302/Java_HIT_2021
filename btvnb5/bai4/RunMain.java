package btvnb5.bai4;

public class RunMain{
    public static void main(String[] args) {
        Sum<Integer> integerSums = new Sum<Integer>();
        integerSums.setSoA(2);
        integerSums.setSoB(3);
        System.out.println("Sum integer: "+ (integerSums.getSoA()+ integerSums.getSoB()));

        Sum<Long> longSums = new Sum<Long>();
        longSums.setSoA(27l);
        longSums.setSoB(10l);
        System.out.println("Sum long: "+(longSums.getSoA() +  longSums.getSoB()));

        Sum<Float> floatSum = new Sum<Float>();
        floatSum.setSoA(2.8f);
        floatSum.setSoB(0.4f);
        System.out.println("Sum float: "+(floatSum.getSoA()+ floatSum.getSoB()));

        Sum<Double> doubleSums = new Sum<Double>();
        doubleSums.setSoA(2.9);
        doubleSums.setSoB(0.2);
        System.out.println("Sum double: "+(doubleSums.getSoA()+ doubleSums.getSoB()));
    }

}
