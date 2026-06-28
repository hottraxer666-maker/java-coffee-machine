public class Main{
    public static void main(String[] args) {
        OptionList optionList=new OptionList();
        TurnOn turnOn= new TurnOn();
        turnOn.start();
        while(turnOn.getIsOn()){
            optionList.optionList();
        }
    }
}