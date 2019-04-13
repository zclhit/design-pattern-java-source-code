package sample01.homework.Client;

import sample01.homework.ControllerFactory;
import sample01.homework.InterfaceController;
import sample01.homework.LinuxFactory;
import sample01.homework.OperationController;

public class GameClient {
    public static void main(String[] args) {
        ControllerFactory cf;
        InterfaceController ic;
        OperationController oc;
        cf = new LinuxFactory();
        ic = cf.getInterfaceController();
        oc = cf.getOperationController();
        ic.control();
        oc.control();
    }
}
