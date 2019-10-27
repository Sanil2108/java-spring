package mypackage.beans;

public class MyBeanImpl implements MyBean{
    String message;

    public MyBeanImpl (String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}