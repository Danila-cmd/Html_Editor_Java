package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;

    private JTabbedPane tabbedPane = new JTabbedPane(); // панель с вкладками
    private JTextPane htmlTextPane = new JTextPane(); // компонент для визуального редактирования html - 1 вкладка в панели
    private JEditorPane plainTextPane = new JEditorPane(); // компонент для визуального редактирования html, отображает код html (теги и их содиржимое) - 2 вкладка в панели

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
        initGui();
        addWindowListener(new FrameListener(this));
        setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    // инициализация меню
    public void initMenuBar() {
    }

    // инициализация панели редактора
    public void initEditor() {

        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPane1 = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", jScrollPane1);
        JScrollPane jScrollPane2 = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", jScrollPane2);

        Dimension preferredSize = new Dimension(400, 200);
        tabbedPane.setPreferredSize(preferredSize);

        TabbedPaneChangeListener tabbedPaneChangeListener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(tabbedPaneChangeListener);

        getContentPane().add(tabbedPane, BorderLayout.CENTER);

    }

    // инициализация графического интерфейса
    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }

}
