public class SomaDigitos {
    public static void main(String[] args) {
        System.out.println(somaDigitos(9875));
    }

    public static int somaDigitos(int number){
        return (number / 10 == 0) ? number : somaDigitos(somaDigitos(number / 10) + somaDigitos(number % 10));
    }
}
