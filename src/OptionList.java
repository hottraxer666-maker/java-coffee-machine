public class OptionList {
    Ingredients ingredients=new Ingredients();
    DrinksService drinksService=new DrinksService();
    CustomDrinks customDrinks = new CustomDrinks();
    Logs logs = new Logs();
    TurnOn turnOn= new TurnOn();

    public void optionList(){
        System.out.println("""
                  1. Выбрать напиток
                  2. Список напитков
                  3. Запас ингредиентов
                  4. Пополненить запас ингредиентов
                  5. Создать нового напитка
                  6. Список созданных напитков
                  7. Журнал событий
                  8. Выключить кофемашину""");
        chooseOption();
    }
    public void chooseOption(){
        System.out.println("Выберите действие: ");
        int num = ScannerService.scanInt();
        switch(num){
            case 1: drinksService.chooseDrink();
                break;
            case 2: drinksService.showDefaultDrinks();
                logs.addLogs(Options.DEFAULTDRINKLIST.getMessage());
                break;
            case 3:
                ingredients.showIngredients();
                logs.addLogs(Options.INGREDIENTSSTORE.getMessage());
                break;
            case 4:
                ingredients.restoreIngredients();
                break;
            case 5: customDrinks.addDrink();
                break;
            case 6: customDrinks.showDrinksList();
                break;
            case 7:
                logs.showLogs();
                break;
            case 8: turnOn.turnOff();
                break;
            default:System.out.println("Некорректный ввод!Попробуйте ещё раз");
        }
    }
}
