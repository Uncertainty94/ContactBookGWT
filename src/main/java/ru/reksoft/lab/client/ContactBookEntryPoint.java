package ru.reksoft.lab.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import ru.reksoft.lab.client.service.TestRemoteService;
import ru.reksoft.lab.client.service.TestRemoteServiceAsync;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ContactBookEntryPoint implements EntryPoint {


    private static TestRemoteServiceAsync rs = (TestRemoteServiceAsync) GWT.create(TestRemoteService.class);


    @Override
    public void onModuleLoad() {
        String version = GXT.getVersion().getRelease();
        TextButton textButton = new TextButton("Verify GXT Works: Version=" + version);



        RootPanel.get("gwtContainer").add(textButton);
        textButton.addSelectHandler(new SelectHandler() {
            @Override
            public void onSelect(SelectEvent event) {
                MessageBox messageBox = new MessageBox("Go Go power GXT");
                final Label lbl = new Label();
//                rs.getCont(new AsyncCallback<String>() {
//                    @Override
//                    public void onFailure(Throwable throwable) {
//                        lbl.setText("Fail on " + throwable.getMessage());
//                    }
//
//                    @Override
//                    public void onSuccess(String o) {
//                        lbl.setText(o);
//                    }
//                });
                messageBox.add(lbl);
                messageBox.show();

            }
        });
    }

}
