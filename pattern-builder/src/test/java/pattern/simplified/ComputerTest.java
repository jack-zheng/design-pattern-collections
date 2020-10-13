package pattern.simplified;

import org.junit.Test;

public class ComputerTest {
    @Test
    public void test_create_computer() {
        Computer computer = new Computer.Builder("Intel", "Kingston").setDisplay("Mac").setKeyboard("Cherry").setUsbCount(3).build();
        System.out.println(computer);
    }
}