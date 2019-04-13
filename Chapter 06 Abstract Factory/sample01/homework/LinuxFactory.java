package sample01.homework;

public class LinuxFactory implements ControllerFactory {
    @Override
    public InterfaceController getInterfaceController() {
        return new LinuxInterfaceController();
    }

    @Override
    public OperationController getOperationController() {
        return new LinuxOperationController();
    }
}
