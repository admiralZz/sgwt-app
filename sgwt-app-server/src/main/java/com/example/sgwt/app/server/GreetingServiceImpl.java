package com.example.sgwt.app.server;

import com.example.sgwt.app.bridge.client.GreetingService;
import com.example.sgwt.app.dto.client.Item;
import com.google.gwt.user.server.rpc.jakarta.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

  @Override
  public Item greetServer(String input) {
    String serverInfo = getServletContext().getServerInfo();
    String userAgent = getThreadLocalRequest().getHeader("User-Agent");
    Item item = new Item();
    item.setId(1L);
    item.setValue("Hello, " + input + "!<br><br>I am running " + serverInfo
        + ".<br><br>It looks like you are using:<br>" + userAgent);

    return item;
  }
}
