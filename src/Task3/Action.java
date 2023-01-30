package Task3;

public interface Action<T extends Human, V> {
    /**Кто-то зовет кого-то, тот отвечает*/
    void callingAnswer(T t, V v);
    void noise (V v);
}
