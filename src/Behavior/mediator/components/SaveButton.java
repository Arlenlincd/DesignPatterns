package Behavior.mediator.components;

import Behavior.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName: SaveButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}