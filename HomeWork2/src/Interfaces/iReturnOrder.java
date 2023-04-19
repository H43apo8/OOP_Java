package Interfaces;

/**
 * Интерфейс возврата товара.
 */
public interface iReturnOrder {
    /**
     * Метод для проверки возможности возврата товара.
     * @return true - если возврат возможен, false - если нет.
     */
    boolean canReturn();

    /**
     * Метод для возврата товара.
     * @return true - если возврат произведен успешно, false - если нет.
     */
    boolean returnOrder();
}