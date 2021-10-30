package bai2_buoi3;

public class RunMain {
    public static void main(String [] args){
        Array arr1 = new Array();
        arr1.inputData();
        Array arr2 = new Array();
        arr2.inputData();

        double tbc1 = (double) arr1.sum() / arr1.getN();
        double tbc2 = (double) arr2.sum() / arr2.getN();
        if(tbc1>tbc2){
            System.out.println("TBC cua arr1 lon hon arr2");
        }
        else if(tbc1<tbc2){
            System.out.println("TBC cua arr2 lon hon arr1");
        }
        else{
            System.out.println("Bye!");
        }
    }
}
