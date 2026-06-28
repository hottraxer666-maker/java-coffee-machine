public class TurnOn {
    Logs logs = new Logs();
    private boolean isOn=false;
    public void start(){
        System.out.println("Включить кофемашину?\n1.Да\n2.Нет");
        int num = ScannerService.scanInt();
        if (num == 1) {
            turnOn();
            System.out.println("Включаем кофе машину...\n");
        }else if(num==2){
            turnOff();
        }else{
            System.out.println("Неверный ввод попробуйте ещё раз");
            start();
        }
    }
    public boolean getIsOn(){
        return isOn;
    }
    public void turnOn(){
        logs.addLogs(Options.TURNON.getMessage());
        isOn=true;
    }
    public void turnOff(){
        logs.addLogs(Options.TURNOFF.getMessage());
        isOn=false;
    }
}
