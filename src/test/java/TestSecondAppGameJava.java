import org.junit.Test;

import static org.junit.Assert.*;

public class TestSecondAppGameJava {
    @Test
    public void writingNotANumber(){
        String result = View.INPUT_NOT_NUMBER;
        Controller controller = new Controller();
        assertEquals(result, controller.inputNumberToGame("dfg"));

    }
    @Test
    public void writingCorrectNumber(){
        String result = View.INPUT_CORRECT;
        Controller controller = new Controller();
        Model model = new Model();
        assertEquals(result, controller.inputNumberToGame(model.getMyNumber()));

    }
    @Test
    public void writingNotCorrectNumber(){
        String result = View.INPUT_NOT_CORRECT;
        Controller controller = new Controller();
        assertEquals(result, controller.inputNumberToGame(2));

    }
    @Test
    public void writingBiggerNumber(){
        String result = View.INPUT_MORE_THAN;
        Controller controller = new Controller();
        Model model = new Model();
        assertEquals(result, controller.inputNumberToGame(model.getMyNumber() + 1));

    }
    public void writingSmalerNumber(){
        String result = View.INPUT_LESS_THAN;
        Controller controller = new Controller();
        Model model = new Model();
        assertEquals(result, controller.inputNumberToGame(model.getMyNumber() - 1));

    }
}
