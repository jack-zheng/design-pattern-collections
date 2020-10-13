package pattern.traditional;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void test_builder() {
        ComputerDirector director = new ComputerDirector();

        MacBuilder macBuilder = new MacBuilder("I5", "Sansong 4G");
        director.makeComputer(macBuilder);
        System.out.println(macBuilder.getComputer());

        LenovoBuilder lenovoBuilder = new LenovoBuilder("I7", "Kingston 8G");
        director.makeComputer(lenovoBuilder);
        System.out.println(lenovoBuilder.getComputer());
    }
}