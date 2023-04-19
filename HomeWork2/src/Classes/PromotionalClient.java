package Classes;

/**
 * Класс, описывающий акционного клиента.
 */
public class PromotionalClient {
    private String promotionName; // Название акции
    private static int clientNumberInPromotion; // Номер клиента в акции

    /**
     * Конструктор класса.
     * @param promotionName Название акции.
     */
    public PromotionalClient(String promotionName) {
        this.promotionName = promotionName;
        clientNumberInPromotion++;
    }

    /**
     * Геттер для названия акции.
     * @return Название акции.
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Сеттер для названия акции.
     * @param promotionName Название акции.
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * Статический геттер для номера клиента в акции.
     * @return Номер клиента в акции.
     */
    public static int getClientNumberInPromotion() {
        return clientNumberInPromotion;
    }
}