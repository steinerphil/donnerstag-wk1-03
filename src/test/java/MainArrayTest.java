import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainArrayTest {

@Test

    void checkArray(){

        //GIVEN
        String[] expected = {"Student 0", "Student 1"};

        //WHEN
        String[] given = MainArray.fillArray();

        //THEN
        assertArrayEquals(expected, given);
    }

}