package _14_exception_and_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    String errorMessenger;
    public IllegalTriangleException(String isErrorMessenger) {
    errorMessenger=isErrorMessenger;
    }

    public String getErrorMessenger() {
        return errorMessenger;
    }

    public static void TriangleException(int a, int b, int c) throws IllegalTriangleException {
        if(a+b<c||a+c<b||c+b<a||a<0||b<0||c<0){
            throw new IllegalTriangleException("Not a triangle");
        }else System.out.println("Is a Triangle");
    }
}
