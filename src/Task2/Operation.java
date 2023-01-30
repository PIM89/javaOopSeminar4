package Task2;

public class Operation<T, V> implements Action {

    @Override
    public void move(Human human, Furniture furniture) {
        System.out.println(human.toString() + "подвинул " + furniture.toString());
    }

    @Override
    public void wipe(Human human, Furniture furniture) {
        System.out.println(human.toString() + "протер " + furniture.toString());

    }
}
