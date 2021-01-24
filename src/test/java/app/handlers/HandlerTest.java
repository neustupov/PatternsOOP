package app.handlers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HandlerTest {

  private FirstHandler firstHandler;
  @Spy
  private SecondHandler secondHandler;
  @Spy
  private Request request;

  @BeforeEach
  void setUp() {
    firstHandler = new FirstHandler(secondHandler);
    request.getParams().put("Second", "Some param");
  }

  @Test
  void testHandle(){
    assertEquals(firstHandler.handle(request), "Handle in SecondHandler");
  }
}