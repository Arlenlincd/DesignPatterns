package Behavior.command.commands;

import Behavior.command.editor.Editor;

/**
 * @ClassName: CopyCommand
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
