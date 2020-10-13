package pattern.traditional;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder) {
        // 定制组装顺序
        builder.setDisplay();
        builder.setKeyboard();
        builder.setUsbCount();
    }
}
