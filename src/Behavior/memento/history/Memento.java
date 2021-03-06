package Behavior.memento.history;

import Behavior.memento.editor.Editor;

/**
 * @ClassName: Memento
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/4/1
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
