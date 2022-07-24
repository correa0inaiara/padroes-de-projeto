import facade.Facade;
import singleton.SingletonEarger;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Padrões de Projeto

        // Testes relacionados ao Design Pattern Singleton (Padrão Criacionista)
//        singleton();

        // Testes relacionados ao Design Pattern Strategy (Padrão Comportamental)
//        strategy();

        // Testes relacionados ao Design Pattern Facade (Padrão Estrutural)
        facade();
    }

    public static void singleton() {

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println();

        SingletonEarger eager = SingletonEarger.getInstancia();
        System.out.println(eager);
        eager = SingletonEarger.getInstancia();
        System.out.println(eager);

        System.out.println();

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }

    public static void strategy() {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }

    public static void facade() {
        Facade facade = new Facade();
        facade.migrarCliente("Naiara", "14801788");
    }
}
