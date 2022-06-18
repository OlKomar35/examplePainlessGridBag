package com.komar_olga;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

import javax.swing.*;


public class ExampleWindow extends JFrame {
    private JButton btn;
    private JLabel label;
    private JList list;
    private JTabbedPane tabbedPane;

    public ExampleWindow() {
        btn = new JButton("enter");
        label = new JLabel("click to button");
        String[] listElems = new String[10];
        for (int i = 0; i < 10; i++) {
            listElems[i] = "element " + i;
        }
        list = new JList(listElems);
        JScrollPane pane = new JScrollPane(list);
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("first", new JPanel());
        tabbedPane.addTab("second", new JPanel());
        setTitle("Demo window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800, 300, 400, 400);
        PainlessGridbagConfiguration config = new PainlessGridbagConfiguration();
        config.setFirstColumnLeftSpacing(5);
        config.setFirstRowTopSpacing(5);
        config.setLastColumnRightSpacing(5);
        config.setLastRowBottomSpacing(5);
        PainlessGridBag gbl = new PainlessGridBag(getContentPane(), config, false);
        gbl.row().cell(btn).cell(label).fillX();
        gbl.row().cell(list).cellXRemainder(tabbedPane).fillX();
        gbl.doneAndPushEverythingToTop();
        setVisible(true);

    }


}
