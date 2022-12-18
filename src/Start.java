public class Start {
    public static void main(String[] args) {

        String regex1 = "tup tuup tuuup tuuuup";
        String regex2 = regex1.replaceAll("u{2,3}", "x");
        System.out.println(regex2);
    }
}
