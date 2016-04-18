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
public class TimelinePrinterShould {
  private static final List<Message> NO_MESSAGES = emptyList();

  @Mock Console console;

  private TimelinePrinter timelinePrinter;

  @Before public void initialize() {
    timelinePrinter = new TimelinePrinter("Spike", console);
  }

  @Test public void alwaysPrintTimelineHeader() {
    timelinePrinter.print(NO_MESSAGES);
    verify(console).printLine("*** Spike's Timeline ***");
  }

  @Test public void printMessagesInReverseChronologicalOrder() {
    Message firstMessage = new Message("Spike", "First post");
    Message secondMessage = new Message("Spike", "Second post");
    Message thirdMessage = new Message("Spike", "Third post");

    List<Message> messages = messagesPresenter(firstMessage, secondMessage, thirdMessage);
    timelinePrinter.print(messages);

    InOrder inOrder = inOrder(console);
    inOrder.verify(console).printLine("*** Spike's Timeline ***");
    inOrder.verify(console).printLine("Third post");
    inOrder.verify(console).printLine("Second post");
    inOrder.verify(console).printLine("First post");
  }

  private List<Message> messagesPresenter(Message... messages) {
    return asList(messages);
  }
}