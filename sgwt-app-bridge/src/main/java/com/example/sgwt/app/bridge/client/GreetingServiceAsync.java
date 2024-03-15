package com.example.sgwt.app.bridge.client;

import com.example.sgwt.app.dto.client.Item;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
  void greetServer(String input, AsyncCallback<Item> callback);
}
