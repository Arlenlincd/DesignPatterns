package Behavior.observer.editor;

import Behavior.observer.publisher.EventManager;

import java.io.File;

/**
 * @ClassName: Editor
 * @Description: 具体发布者， 由其他对象追踪
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}