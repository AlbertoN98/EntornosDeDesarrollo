public class Main {
    public static void main(String[] args) {

    }
    public static int Divisible3 (int a){
        int suma = 0;
        for (int i = 1; i <= a; i++){
            suma += i;
        }
        if (suma % 3 == 0){
            return 0;
        }
        return -1;
    }
}
