package sample01.homework;

public interface ControllerFactory {
    InterfaceController getInterfaceController();

    OperationController getOperationController();
}
