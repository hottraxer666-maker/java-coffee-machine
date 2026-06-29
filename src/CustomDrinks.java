import java.util.ArrayList;
import java.util.List;

public class CustomDrinks {
    Ingredients ingredients=new Ingredients();
    Logs logs = new Logs();
    private static final List<CustomDrinks> drinks=new ArrayList<>();
    private final String name;
    private final int drinksCoffee;
    private final int drinksWater;
    private final int drinksMilk;
    CustomDrinks(String name,int drinksCoffee,int drinksWater,int drinksMilk){
        this.name=name;
        this.drinksCoffee=drinksCoffee;
        this.drinksWater=drinksWater;
        this.drinksMilk=drinksMilk;
    }
    CustomDrinks(){
        name="";
        drinksCoffee=0;
        drinksWater=0;
        drinksMilk=0;
    }
    public void showDrinksList(){
        System.out.println("Список пользовательских напитков: "+drinks);
        logs.addLogs(Options.CUSTOMDRINKLIST.getMessage());
    }
    public void addDrink(){
        System.out.println("Введите название для нового напитка: ");
        String newName=ScannerService.scanString();
        for(Drinks drink:Drinks.values()){
            if(newName.toLowerCase().equals(drink.getName().toLowerCase())){
                    System.out.println("Нельзя вводить уже существующие стандартные напитки!");
                    addDrink();
            }
        }
        for(CustomDrinks drink:drinks){
            if(newName.toLowerCase().equals(drink.name.toLowerCase())){
                System.out.println("Нельзя вводить уже существующие пользовательские напитки!");
                addDrink();
            }
        }
        boolean isCorrect=false;
        int coffee=0;
        while(!isCorrect){
            System.out.println("Введите количество кофе: ");
            coffee=ScannerService.scanInt();
            if(coffee>=0){
                isCorrect=true;
            }else{
                System.out.println("Некорректный ввод!Попробуйте ещё раз");
            }
        }
        isCorrect=false;
        int water=0;
        while(!isCorrect){

            System.out.println("Введите количество воды: ");
            water=ScannerService.scanInt();
            if(water>=0){
                isCorrect=true;
            }else{
                System.out.println("Некорректный ввод!Попробуйте ещё раз");
            }
        }
        isCorrect=false;
        int milk=0;
        while(!isCorrect){
            System.out.println("Введите количество молока: ");
            milk=ScannerService.scanInt();
            if(milk>=0){
                isCorrect=true;
            }else{
                System.out.println("Некорректный ввод!Попробуйте ещё раз");
            }
        }
        drinks.add(new CustomDrinks(newName,coffee,water,milk));
        System.out.println("Вы добавили новый напиток: "+newName);
        logs.addLogs(Options.ADDDRINKS.drinkMessage(newName));
    }
    public int drinkLength(){
        return drinks.size();
    }

    public List<CustomDrinks> getDrinks() {
        return drinks;
    }
    public String getName() {
        return name;
    }
    public void buyDrink(CustomDrinks drink){
        boolean isCorrect=true;
        if(ingredients.getCoffee()<drink.drinksCoffee){
            System.out.println("Ошибка!Недостаточно кофе!");
            isCorrect=false;
        }
        if(ingredients.getWater()<drink.drinksWater){
            System.out.println("Ошибка!Недостаточно воды!");
            isCorrect=false;
        }
        if(ingredients.getMilk()<drink.drinksMilk){
            System.out.println("Ошибка!Недостаточно молока!");
            isCorrect=false;
        }
        if(isCorrect){
            ingredients.spendIngredients(drink.drinksCoffee,drink.drinksWater,drink.drinksMilk);
            System.out.println("Вот ваш "+drink.name);
        }
    }
    @Override
    public String toString(){
        return name;
    }
}
