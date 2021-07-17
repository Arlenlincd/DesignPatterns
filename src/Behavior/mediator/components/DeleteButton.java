package Behavior.mediator.components;

import Behavior.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName: DeleteButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
