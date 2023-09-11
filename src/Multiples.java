public class Multiples {

    public static void main(String[] args) {
        int numMultiplesOf3And9 = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                numMultiplesOf3And9++;
            }
        }
        System.out.println(numMultiplesOf3And9);
    }
}
