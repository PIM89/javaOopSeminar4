package Task2;

public interface Action<T extends Human, V extends Furniture> {

    /**Кто-то двигает что-то*/
    void move(T t, V v);

    /**Кто-то протирает мебель*/
    void wipe(T t, V v);
}
