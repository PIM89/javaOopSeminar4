package Task3;

public class Operation<T, V> implements Action {

    @Override
    public void callingAnswer(Human human, Object o) {
        System.out.println(human.toString() + "зовет " + o.toString());
        noise(o);
    }

    @Override
    public void noise(Object o) {
        System.out.println(o.toString() + " издает звук");
    }

}