package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;

    private JTabbedPane tabbedPane = new JTabbedPane(); // панель с вкладками
    private JTextPane htmlTextPane = new JTextPane(); // компоент для визуального редактирования html - 1 вкладка в панели
    private JEditorPane plainTextPane = new JEditorPane(); // компоент для визуального редактирования html, отображает код html (теги и их содиржимое) - 2 вкладка в панели

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {
    }

    public void exit() {
        controller.exit();
    }

}
