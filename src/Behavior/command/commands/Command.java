package Behavior.command.commands;

import Behavior.command.editor.Editor;

/**
 * @ClassName: Command
 * @Description: 抽象基础命令
 * @Author: arlin
 * @Date: 2021/6/28
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}