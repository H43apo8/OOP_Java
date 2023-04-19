package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс клиента.
 */
public class Client implements iReturnOrder {
    private String name; // Имя клиента
    private int age; // Возраст клиента
    private boolean hasDiscount; // Наличие скидки

    /**
     * Конструктор класса.
     * 
     * @param name        Имя клиента.
     * @param age         Возраст клиента.
     * @param hasDiscount Наличие скидки.
     */
    public Client(String name, int age, boolean hasDiscount) {
        this.name = name;
        this.age = age;
        this.hasDiscount = hasDiscount;
    }

    /**
     * Геттер для имени клиента.
     * 
     * @return Имя клиента.
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер для имени клиента.
     * 
     * @param name Имя клиента.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер для возраста клиента.
     * 
     * @return Возраст клиента.
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер для возраста клиента.
     * 
     * @param age Возраст клиента.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Геттер для наличия скидки у клиента.
     * 
     * @return true - если у клиента есть скидка, false - если нет.
     */
    public boolean isHasDiscount() {
        return hasDiscount;
    }

    /**
     * Сеттер для наличия скидки у клиента.
     * 
     * @param hasDiscount Наличие скидки.
     */
    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    /**
     * Метод для проверки возможности возврата товара.
     * 
     * @return true - если возврат возможен, false - если нет.
     */
    @Override
    public boolean canReturn() {
        // Логика проверки возможности возврата товара
        return true;
    }

    /**
     * Метод для возврата товара.
     * 
     * @return true - если возврат произведен успешно, false - если нет.
     */
    @Override
    public boolean returnOrder() {
        // Логика возврата товара
        return true;
    }
}