package Controller;

public class FatController extends Thread {

    int fatType;
    long fatNumber;

    public FatController(int fatType, long fatNumber){

        this.fatType = fatType;
        this.fatNumber = fatNumber;

    }


    @Override
    public void run() {

        if(fatType == 1) {

            double tStart = System.nanoTime();
            long result = fatRecursive(fatNumber);
            double tEnd = System.nanoTime();
            double tResult = tEnd - tStart;
            System.out.println("Resultado: " + result + " e o tempo de processamento para o fatorial recursivo: " + (tResult / 1000000000) + " Segundos" );
        } else if(fatType == 2) {
            double tStart = System.nanoTime();
            long result = fatNotRecursive(fatNumber);
            double tEnd = System.nanoTime();
            double tResult = tEnd - tStart;
            System.out.println("Resultado: " + result + " e o tempo de processamento para o fatorial não recursivo: " + (tResult / 1000000000) + " Segundos" );

        }


    }



    private long fatRecursive(long fatNumber) {

        if (fatNumber < 1) {
            return 1;
        }
        return fatNumber * fatRecursive(fatNumber - 1);
    }

    private long fatNotRecursive(long fatNumber) {
        long result = 1;

        while(fatNumber > 1) {

            result = result * fatNumber;
            fatNumber--;

        }


        return result;

    }

}
