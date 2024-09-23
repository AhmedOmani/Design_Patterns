public class Main {
    public static void main(String[] args) {

        TextEditor notePad = new TextEditor("But i will not confess that i am waited!");
        History history = new History() ;

        //Command design pattern

        System.out.println("Lets invoke by Keyboard..");
        ICommand copy1 = new CopyCommand(notePad) ;
        ICommand cut1 =  new CutCommand(notePad) ;
        ICommand delete1 = new DeleteCommand(notePad) ;

        KeyboardShortcutsInvoker shortcut = new KeyboardShortcutsInvoker() ;
        shortcut.setShortcut("ctrl+c" , copy1);
        shortcut.setShortcut("ctrl+x" , cut1);
        shortcut.setShortcut("delete" , delete1);

        shortcut.press("ctrl+c");
        history.setCommand(notePad.saveCommand(copy1).getCommand()) ;

        shortcut.press("ctrl+x");
        history.setCommand(notePad.saveCommand(cut1).getCommand()) ;

        shortcut.press("delete");
        history.setCommand(notePad.saveCommand(delete1).getCommand());

        System.out.println();

        System.out.println("Lets invoke by Menu..");

        ICommand copy2 = new CopyCommand(notePad) ;
        ICommand cut2 = new CutCommand(notePad) ;
        ICommand delete2 = new DeleteCommand(notePad) ;

        EditMenuInvoker menu = new EditMenuInvoker() ;

        menu.setOption("Copy" , notePad.saveCommand(copy2).getCommand());
        history.setCommand(notePad.saveCommand(copy2).getCommand());

        menu.setOption("Cut" , notePad.saveCommand(cut2).getCommand());
        history.setCommand(notePad.saveCommand(cut2).getCommand());

        menu.setOption("Delete" , delete2);
        history.setCommand(notePad.saveCommand(delete2).getCommand());

        menu.choose("Copy");
        menu.choose("Cut");
        menu.choose("Delete");

        System.out.println();

        //Memento History Design Pattern

        //DeletedByMenu
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());

        //CutByMenu
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());

        //CopyByMenu
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());

        //DeletedByKeyboard
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());

        //CutByKeyboard
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());

        //CopyByKeyboard
        notePad.restoreCommand(new CommandMemento(history.undo())) ;
        System.out.println(notePad.getCurCommand().getStatus());
    }
}