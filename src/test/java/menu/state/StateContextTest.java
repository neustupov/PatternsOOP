package menu.state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StateContextTest {

  @Spy
  private StateContext context;
  @Spy
  private CloseState closeState;
  @Spy
  private OpenState openState;

  @Test
  void openTest(){
    context.setState(closeState);
    assertEquals(context.close(), "Nothing happens");
    assertEquals(context.open(), "set Blur State");
    assertEquals(context.open(), "set Open State");
  }

  @Test
  void closeTest(){
    context.setState(openState);
    assertEquals(context.open(), "Nothing happens");
    assertEquals(context.close(), "set Blur State");
    assertEquals(context.close(), "set Close State");
  }
}