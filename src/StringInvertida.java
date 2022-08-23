public class StringInvertida {
    public static void main(String[] args) {
        System.out.println(inverteString("gabriel"));
    }

    public static String inverteString(String initial){
        return initial.length() == 1 ?  initial : inverteString(initial.substring(1)) + initial.substring(0, 1);
    }
}
