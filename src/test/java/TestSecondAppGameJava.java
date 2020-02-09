import org.junit.Test;

import static org.junit.Assert.*;

public class TestSecondAppGameJava {
    @Test
    public void writingNotANumber(){
        String result = View.INPUT_NOT_NUMBER;
        Controller controller = new Controller();
        assertEquals(result, controller.inputNumberToGame("dfg"));

    }
}
