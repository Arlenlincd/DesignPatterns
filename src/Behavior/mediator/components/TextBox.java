package Behavior.mediator.components;

import Behavior.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @ClassName: TextBox
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
