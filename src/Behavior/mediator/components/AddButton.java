package Behavior.mediator.components;

import Behavior.mediator.mediator.Mediator;
import Behavior.mediator.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName: AddButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
