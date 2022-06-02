import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void everyStatementTest(){
        List<String> list1 = Arrays.asList();
        IllegalArgumentException ex1;
        ex1 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
        assertTrue(ex1.getMessage().contains("List length should be greater than 0"));

        List<String> list2 = Arrays.asList("0", "#", "0", "#", "0", "0", "#");
        IllegalArgumentException ex2;
        ex2 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));
        assertTrue(ex2.getMessage().contains("List length should be a perfect square"));

        List<String> list3 = Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "0", "0", "#", "#", "0", "#", "#", "#");
        assertEquals(Arrays.asList("1", "#", "1", "1", "1", "#", "3", "#", "0", "3", "#", "#", "1", "#", "#", "#"), SILab2.function(list3));
    }

    @Test
    void everyBranchTest(){
        List<String> list1 = Arrays.asList();
        IllegalArgumentException ex1;
        ex1 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
        assertTrue(ex1.getMessage().contains("List length should be greater than 0"));

        List<String> list2 = Arrays.asList("0", "#", "0", "#", "0", "0", "#");
        IllegalArgumentException ex2;
        ex2 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));
        assertTrue(ex2.getMessage().contains("List length should be a perfect square"));

        List<String> list3 = Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "0", "0", "#", "#", "0", "#", "#", "#");
        assertEquals(Arrays.asList("1", "#", "1", "1", "1", "#", "3", "#", "0", "3", "#", "#", "1", "#", "#", "#"), SILab2.function(list3));
    }
}
