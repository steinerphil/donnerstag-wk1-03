import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainArrayTest {

@Test

    void fillArrayTest(){

        //GIVEN
        String[] expected = {"Student 0", "Student 1"};
        //WHEN
        String[] actual = MainArray.fillArray();
        //THEN
        assertArrayEquals(expected, actual);
    }

}