package by.homework.lessons.lesson10;

import java.util.Objects;

/**
 * @author ppuchinsky
 */
public class Connector {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void calculate() throws DevideByZeroException {
//        try {
        System.out.println("Start");
        int result = 10 / getNumber();
        System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("error");
//        } finally {
//            System.out.println("close connection");
//        }
    }

    private int getNumber() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connector connector = (Connector) o;
        return Objects.equals(msg, connector.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg);
    }

    @Override
    public String toString() {
        return "Connector{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
