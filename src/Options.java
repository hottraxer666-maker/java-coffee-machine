public enum Options {
    BUYDRINK("Наливание напитка "),
    TURNON("Включение кофемашинки"),
    DEFAULTDRINKLIST("Просматривание списка обычных напитков"),
    INGREDIENTSSTORE("Просматривание количества ингредиентов"),
    RESTOREINGREDIENTS("Пополнение ингредиентов"),
    ADDDRINKS("Добавление нового напитка "),
    CUSTOMDRINKLIST("Просматривание списка добавленных напитков"),
    LOGS("Просмотр журнала событий"),
    TURNOFF("Выключение кофемашинки");
    private final String message;

    public String getMessage() {
        return message;
    }

    Options(String message){
        this.message=message;
    }

    public String drinkMessage(String drink) {
        return message+drink;
    }
    @Override
    public String toString(){
        return message;
    }
}
