package Behavior.memento.commands;

import Behavior.memento.editor.Editor;
import Behavior.memento.shapes.Shape;

import java.awt.*;

/**
 * @ClassName: ColorCommand
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/4/1
 */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}