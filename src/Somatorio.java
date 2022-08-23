public class Somatorio {
    public static void main(String[] args) {
        System.out.println(soma(4));
    }

    public static int soma(int initial){
        return (initial == 1) ? initial : initial + soma(initial - 1);
    }
}
