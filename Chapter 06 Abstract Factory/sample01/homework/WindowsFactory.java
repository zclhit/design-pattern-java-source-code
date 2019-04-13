package sample01.homework;

public class WindowsFactory implements ControllerFactory {
    @Override
    public InterfaceController getInterfaceController() {
        return new WindowsInterfaceController();
    }

    @Override
    public OperationController getOperationController() {
        return new WindowsOperationController();
    }
}
