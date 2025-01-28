package doublylinkedlist.undoredofunctionality;

class TextEditor {
    private Node head;
    private Node currentNode;
    private int historySize;
    private int maxHistorySize;
    private TextEditorFunctions editorFunctions;

    public TextEditor(int maxHistorySize) {
        this.head = null;
        this.currentNode = null;
        this.historySize = 0;
        this.maxHistorySize = maxHistorySize;
        this.editorFunctions = new TextEditorFunctions();
    }

    public void addState(String newText) {
        editorFunctions.addState(this, newText);
    }

    public void undo() {
        editorFunctions.undo(this);
    }

    public void redo() {
        editorFunctions.redo(this);
    }

    public void displayCurrentState() {
        editorFunctions.displayCurrentState(this);
    }

    public void displayHistory() {
        editorFunctions.displayHistory(this);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public int getHistorySize() {
        return historySize;
    }

    public void setHistorySize(int historySize) {
        this.historySize = historySize;
    }

    public int getMaxHistorySize() {
        return maxHistorySize;
    }

    public void setMaxHistorySize(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
    }
}

class TextEditorFunctions {


    public void addState(TextEditor editor, String newText) {
        Node newNode = new Node(newText);

        if (editor.getHistorySize() == editor.getMaxHistorySize()) {
            removeOldestState(editor);
        } else {
            editor.setHistorySize(editor.getHistorySize() + 1);
        }

        if (editor.getHead() == null) {
            editor.setHead(newNode);
            editor.setCurrentNode(newNode);
        } else {
            Node temp = editor.getHead();
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            editor.setCurrentNode(newNode);
        }
    }

    private void removeOldestState(TextEditor editor) {
        if (editor.getHead() != null) {
            editor.setHead(editor.getHead().next);
            if (editor.getHead() != null) {
                editor.getHead().prev = null;
            }
            editor.setHistorySize(editor.getHistorySize() - 1);
        }
    }

    public void undo(TextEditor editor) {
        if (editor.getCurrentNode() == null || editor.getCurrentNode().prev == null) {
            System.out.println("No more actions to undo.");
            return;
        }

        editor.setCurrentNode(editor.getCurrentNode().prev); // Move to the previous state
        System.out.println("Undo: " + editor.getCurrentNode().text);
    }

    public void redo(TextEditor editor) {
        if (editor.getCurrentNode() != null && editor.getCurrentNode().next != null) {
            editor.setCurrentNode(editor.getCurrentNode().next);
            System.out.println("Redo: " + editor.getCurrentNode().text);
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    public void displayCurrentState(TextEditor editor) {
        if (editor.getCurrentNode() != null) {
            System.out.println("Current Text: " + editor.getCurrentNode().text);
        } else {
            System.out.println("No text available.");
        }
    }

    public void displayHistory(TextEditor editor) {
        Node temp = editor.getHead();
        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.next;
        }
    }
}
