package ru.reksoft.lab.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.google.gwt.user.client.ui.Grid;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ContactBookEntryPoint implements EntryPoint {

//    private static ContactManager cm;

    @Override
    public void onModuleLoad() {
        String version = GXT.getVersion().getRelease();
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
//
//        cm = (ContactManager) context.getBean("contactManager");

        TextButton textButton = new TextButton("Verify GXT Works: Version=" + version);
//        final FlexTable table = new FlexTable();

//        int numRows = grid.getRowCount();
//        int numColumns = grid.getColumnCount();
//        for (int row = 0; row < numRows; row++) {
//            for (int col = 0; col < numColumns; col++) {
//                grid.setWidget(row, col, new Label(row + ";" + col));
//            }
//        }

//        table.add(new Label("First"));
//        table.add(new Label("Second"));
        TextButton addRow = new TextButton("addRow");
        addRow.addSelectHandler(new SelectHandler() {
            @Override
            public void onSelect(SelectEvent event) {
//                table.add(new Label("new"));
            }
        });
        RootPanel.get().add(textButton);
//        RootPanel.get().add(table);
        RootPanel.get().add(addRow);
        textButton.addSelectHandler(new SelectHandler() {
            @Override
            public void onSelect(SelectEvent event) {
                MessageBox messageBox = new MessageBox("Go Go power GXT");
                messageBox.show();
            }
        });
    }

}
