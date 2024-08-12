package by.homework.lessons.lesson10;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) throws DevideByZeroException {
        while (true) {
            try {
                Connector connector = new Connector();
                connector.setMsg("Test msg");
                System.out.println(connector);

                connector.calculate();
            } catch (DevideByZeroException e) {
                System.out.println("log");

                throw new DevideByZeroException("Main exception", e);
            }
        }
    }


}
