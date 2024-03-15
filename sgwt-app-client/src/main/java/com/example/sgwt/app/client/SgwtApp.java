package com.example.sgwt.app.client;

import com.example.sgwt.app.bridge.client.GreetingService;
import com.example.sgwt.app.bridge.client.GreetingServiceAsync;
import com.example.sgwt.app.dto.client.Item;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.layout.VLayout;

public final class SgwtApp implements EntryPoint {
    private IButton button = new IButton("Test");
    private static final GreetingServiceAsync service = GWT.create(GreetingService.class);

    public void onModuleLoad() {
        VLayout layout = new VLayout();
        button.addClickHandler(clickEvent -> service.greetServer("World", new AsyncCallback<>() {
            @Override
            public void onFailure(Throwable throwable) {
                SC.warn(throwable.getMessage());
            }

            @Override
            public void onSuccess(Item s) {
                SC.say(s.getValue());
            }
        }));


        layout.addMember(button);
        layout.draw();
    }

}