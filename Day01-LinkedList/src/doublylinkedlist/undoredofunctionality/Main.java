package doublylinkedlist.undoredofunctionality;

public class Main {
    public static void main(String[] args) {
        // Initialize the text editor with max history size of 5
        TextEditor editor = new TextEditor(5);

        // Add states
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! How are you?");
        editor.addState("Hello, World! How are you? I'm fine.");
        editor.addState("Hello, World! How are you? I'm fine. Thanks!");

        editor.displayCurrentState();  // Last state

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();

        editor.undo();

        editor.redo();
        editor.redo();
        editor.redo();
        editor.redo();

        editor.redo();
    }
}
