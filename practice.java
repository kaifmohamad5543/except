package exception;

public class practice {
    public static void main(String[] args) {
//        int a=10,b=0,c;
//        try {
//            c = a / b;
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("eoor");
//        }

//        this is a null pointer exception handling exception

        String str = null;
        try {

            System.out.println(str.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("this is a null pointe eception handling");
        }
        finally {
            System.out.println("this is a finallyb block ");
        }
    }
}
