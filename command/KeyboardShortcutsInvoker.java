package command;

import java.util.HashMap;
import java.util.Map;

public class KeyboardShortcutsInvoker {

    public Map<String , ICommand> shortCuts ;

    public KeyboardShortcutsInvoker() {
        this.shortCuts = new HashMap<>();
    }

    public void setShortcut(String shortcut , ICommand command){
        shortCuts.put(shortcut , command) ;
    }

    public void press(String shortcut) {
        this.shortCuts.get(shortcut).excute();
    }
}
