public class ArithematicException {
    public static void main(String[] args) {
        System.out.println("before exception");
        try{
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("After handling");
    }
}
