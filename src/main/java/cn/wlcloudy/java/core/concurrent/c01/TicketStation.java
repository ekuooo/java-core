package cn.wlcloudy.java.core.concurrent.c01;

/**
 * @author: X.Tony
 */
public class TicketStation extends Thread {

    public TicketStation(String name) {
        super(name);
    }

    static int tickNum = 20;
    static Object lock = "lock";

    @Override
    public void run() {
        while (tickNum > 0) {
            synchronized (lock) {
                if (tickNum > 0) {
                    System.out.println(getName() + "卖出了第" + tickNum + "张票");
                    tickNum--;
                } else {
                    System.out.println("票卖完了");
                }
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
