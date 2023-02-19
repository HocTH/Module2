package thuchanh;

public class IllegalTriangleException extends Exception {
    private String message = "";
    public IllegalTriangleException() {
    }
    public IllegalTriangleException(String message) {
        this.message = message;
        System.out.println(message);
    }
    public String getMessage(){
        return message;
    }
}
