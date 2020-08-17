package stage5.handle;

public class Handle1 {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        }catch(RuntimeException e){
            return 0;
        }
    }
}
/*
 try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            return 0;
        }
 */