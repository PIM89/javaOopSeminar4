package Task1;

public interface InterfaceTree {
    /**
     * Вывод списка детей
     */
    StringBuilder getChildren();

    /**
     * Вывод списка братьев и сестер
     */
    StringBuilder getSiblings();

    /**
     * Присвоить экземпляру класса Human неограниченное количество детей
     */
    void setChildren(Human... children);

    /**
     * Присвоить экземпляру класса Human неограниченное количество братьев и сестер
     */
    void setSiblings(Human... siblings);
}
