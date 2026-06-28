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
                    logs.addLogs(Options.BUYDRINK.drinkMessage(drink.getName()));
                }
            }
            for(CustomDrinks drink: customDrinks.getDrinks()){
                if(name.toLowerCase().equals(drink.getName().toLowerCase())){
                    customDrinks.buyDrink(drink);
                    logs.addLogs(Options.BUYDRINK.drinkMessage(drink.getName()));
                }
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
        ingredients.spendIngredients(drink.getCoffee(),drink.getWater(),drink.getMilk());
        System.out.println("Вот ваш "+drink.getName());
    }

}
