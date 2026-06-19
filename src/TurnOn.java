public class TurnOn {
    private boolean isOn=false;
    public void start(){
        System.out.println("Включить кофемашину?\n1.Да\n2.Нет");

    }
    public void turnOn(){
        isOn=true;
    }
    public void turnOff(){
        isOn=false;
    }
}
