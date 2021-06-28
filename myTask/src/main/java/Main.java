
import Controller.MyController;
import Model.DataInfo;

public class Main {

    public static void main(String[] args) {
        DataInfo dataInfo = new DataInfo();
       MyController myController = new MyController(dataInfo);
       myController.printMyResult(myController.setDataInfo());
    }
}

