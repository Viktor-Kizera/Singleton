package Singleton;

public class Singleton {
    private static volatile Singleton instance;

    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static synchronized Singleton getInstance(String context) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton(context);
                }
            }
        }
        return instance;
    }
    public String getValue() {
        return value;
    }
}