package pattern.traditional;

public class LenovoBuilder implements ComputerBuilder {
    private Computer computer;

    public LenovoBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        this.computer.setUsbCount(3);
    }

    @Override
    public void setKeyboard() {
        this.computer.setKeyboard("Logic");
    }

    @Override
    public void setDisplay() {
        this.computer.setDisplay("ThinkVision");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
