package command;

import java.util.HashMap;
import java.util.Map;

public class EditMenuInvoker {

    Map<String , ICommand> menuItems ;

    public EditMenuInvoker() {
        menuItems = new HashMap<>() ;
    }

    public void setOption(String item , ICommand command) {
        this.menuItems.put(item , command) ;
    }

    public void choose(String item) {
        this.menuItems.get(item).excute();
    }
}
