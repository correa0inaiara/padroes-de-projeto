package singleton;

public class SingletonEarger {

    private static SingletonEarger instancia = new SingletonEarger();

    private SingletonEarger() {
        super();
    }

    public static SingletonEarger getInstancia() {
        return  instancia;
    }

}
