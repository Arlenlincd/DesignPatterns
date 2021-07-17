package Behavior.command.commands;

import Behavior.command.editor.Editor;

/**
 * @ClassName: PasteCommand
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}