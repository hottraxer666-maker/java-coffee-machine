import java.util.ArrayList;
import java.util.List;

public class Logs {
private static final List<String> list = new ArrayList<>();
public void addLogs(String message){
    list.add(message);
}
public void showLogs(){
    addLogs(Options.LOGS.getMessage());
    for(String log:list){
        System.out.println(log);
    }
}
}
