package thejavanetwork;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SubscriptionsPrinterShould {
  private static final List<String> NO_SUBSCRIPTION_MESSAGES = emptyList();

  @Mock Console console;

  private SubscriptionsPrinter subscriptionsPrinter;

  @Before public void initialize() {
    subscriptionsPrinter = new SubscriptionsPrinter("Spike", console);
  }

  @Test public void alwaysPrintSubscriptionsHeader() {
    subscriptionsPrinter.print(NO_SUBSCRIPTION_MESSAGES);
    verify(console).printLine("*** Spike's Subscriptions ***");
  }

  @Test public void printSubscriptionMessagesInOrder() {
    List<String> subscriptionMessages = messagesPresenter("@Spike: Spike's first post",
                                                          "@Spike: Spike's second post",
                                                          "@Nikesh: Nikesh's first post");
    subscriptionsPrinter.print(subscriptionMessages);

    InOrder inOrder = inOrder(console);
    inOrder.verify(console).printLine("*** Spike's Subscriptions ***");
    inOrder.verify(console).printLine("@Spike: Spike's first post");
    inOrder.verify(console).printLine("@Spike: Spike's second post");
    inOrder.verify(console).printLine("@Nikesh: Nikesh's first post");
  }

  private List<String> messagesPresenter(String... messages) {
    return asList(messages);
  }
}