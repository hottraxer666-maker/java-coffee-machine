public class Ingredients {
    Logs logs = new Logs();
    private static int coffee=1000;
    private static int water=1000;
    private static int milk=1000;
public void restoreIngredients(){
    boolean isCorrect=false;
    while(!isCorrect) {
        System.out.println("Выберите ингредиент для пополнения:\n1.Кофе\n2.Вода\n3.Молоко");
        int numToAdd=0;
        int num = ScannerService.scanInt();
        if (num == 1) {
            isCorrect=true;
            boolean isCorrectCoffee=false;
            while(!isCorrectCoffee){
                System.out.println("Сейчас кофе в машинке: "+coffee+"\nВведите количество кофе для пополнения: ");
                numToAdd=ScannerService.scanInt();
                if(numToAdd>=0){
                    isCorrectCoffee=true;
                    coffee+=numToAdd;
                    System.out.println("Пополнение кофе на "+numToAdd+" количество кофе: "+coffee);
                    numToAdd=0;
                }else{
                    System.out.println("Некорректный ввод!попробуйте ещё раз");
                }
            }

        } else if (num == 2) {
            isCorrect=true;
            boolean isCorrectWater=false;
            while(!isCorrectWater){
                System.out.println("Сейчас воды в машинке: "+water+"\nВведите количество воды для пополнения: ");
                numToAdd=ScannerService.scanInt();
                if(numToAdd>=0){
                    isCorrectWater=true;
                    water+=numToAdd;
                    System.out.println("Пополнение воды на "+numToAdd+" количество воды: "+water);
                    numToAdd=0;
                }else{
                    System.out.println("Некорректный ввод!попробуйте ещё раз");
                }
            }

        } else if (num == 3) {
            isCorrect=true;
            boolean isCorrectMilk=false;
            while(!isCorrectMilk){
                System.out.println("Сейчас молока в машинке: "+milk+"\nВведите количество молока для пополнения: ");
                numToAdd=ScannerService.scanInt();
                if(numToAdd>=0){
                    isCorrectMilk=true;
                    milk+=numToAdd;
                    System.out.println("Пополнение молока на "+numToAdd+" количество молока: "+milk);
                    numToAdd=0;
                }else{
                    System.out.println("Некорректный ввод!попробуйте ещё раз");
                }
            }

        } else {
            System.out.println("Некорректный ввод!попробуйте ещё раз");
        }
    }
    logs.addLogs(Options.RESTOREINGREDIENTS.getMessage());
}
public void showIngredients(){
    System.out.println("Доступные ингредиенты:\nКофе - "+coffee+"\nВода - "+water+"\nМолоко - "+milk);
    logs.addLogs(Options.INGREDIENTSSTORE.getMessage());
}

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }
    public void spendIngredients(int spentCoffee,int spentWater,int spentMilk){
    coffee-=spentCoffee;
    milk-=spentMilk;
    water-=spentWater;
    }
}
