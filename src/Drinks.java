public enum Drinks {
    ESPRESSO("эспрессо",20,250,0),
    AMERICANO("американо",20,350,0),
    CAPPUCCINO("капучино",20,200,100);
    private final String name;
    private final int drinksCoffee;
    private final int drinksWater;
    private final int drinksMilk;
Drinks(String name,int drinksCoffee,int drinksWater,int drinksMilk){
    this.name=name;
    this.drinksCoffee=drinksCoffee;
    this.drinksWater=drinksWater;
    this.drinksMilk=drinksMilk;
}

    public String getName() {
        return name;
    }

    public int getCoffee(){
    return drinksCoffee;
}
public int getWater(){
    return drinksWater;
}
public int getMilk(){
    return drinksMilk;
}
@Override
    public String toString(){
    return name;
}

}
