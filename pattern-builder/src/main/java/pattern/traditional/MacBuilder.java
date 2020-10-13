package pattern.traditional;

public class MacBuilder implements ComputerBuilder {
    private Computer computer;

    public MacBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        this.computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        this.computer.setKeyboard("Mac Keyboard");
    }

    @Override
    public void setDisplay() {
        this.computer.setDisplay("Mac Display");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
