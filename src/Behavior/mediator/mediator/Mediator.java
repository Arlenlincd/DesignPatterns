package Behavior.mediator.mediator;

import Behavior.mediator.components.Component;

import javax.swing.*;

/**
 * @ClassName: Mediator
 * @Description: 定义通用的中介者接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
