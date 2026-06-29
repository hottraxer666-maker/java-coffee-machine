public class DrinksService {
    Logs logs = new Logs();
    Ingredients ingredients= new Ingredients();
    CustomDrinks customDrinks=new CustomDrinks();
    public void chooseDrink(){
        showDefaultDrinks();
        if(customDrinks.drinkLength()>0){
            customDrinks.showDrinksList();
        }
        boolean isCorrect=false;
        while(!isCorrect){
            System.out.println("Введите название выбираемого напитка: ");
            String name = ScannerService.scanString();
            for(Drinks drink:Drinks.values()){
                if(name.toLowerCase().equals(drink.getName().toLowerCase())){
                    isCorrect=true;
                    buyDrink(drink);
                }
            }
            for(CustomDrinks drink: customDrinks.getDrinks()){
                if(name.toLowerCase().equals(drink.getName().toLowerCase())){
                    isCorrect=true;
                    customDrinks.buyDrink(drink);
                }
            }
            if(!isCorrect){
                System.out.println("Ошибка!Данного напитка нет ни в одном списке!Попробуйте ещё раз");
            }
        }

    }
    public void showDefaultDrinks(){
        System.out.print("Список обычных напитков: \n[ ");
        for(Drinks drink:Drinks.values()){
            System.out.print(drink+" ");
        }
        System.out.println("]");
    }
    protected void buyDrink(Drinks drink){
        if(drink.getMilk()>ingredients.getMilk()||drink.getWater()>ingredients.getWater()||drink.getCoffee()>ingredients.getCoffee()){
            System.out.println("Ошибка!Недостотаточно ингредиентов!");
            System.out.println("Вам нужно:\nкофе- "+drink.getCoffee()+"\nвода- "+drink.getWater()+"\nмолоко- "+drink.getMilk());
            ingredients.showIngredients();
        }else{
        ingredients.spendIngredients(drink.getCoffee(),drink.getWater(),drink.getMilk());
        System.out.println("Вот ваш "+drink.getName());
        logs.addLogs(Options.BUYDRINK.drinkMessage(drink.getName()));
    }
    }
}
