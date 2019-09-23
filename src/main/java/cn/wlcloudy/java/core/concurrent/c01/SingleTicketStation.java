package cn.wlcloudy.java.core.concurrent.c01;

/**
 * @author: X.Tony
 */
public class SingleTicketStation{

    private String name;

    public SingleTicketStation(String name){
        this.name = name;
    }

    static int tickNum = 20;
    static Object lock = "lock";

    public void sale(){
        while (tickNum > 0) {
            System.out.println(getName() + "卖出了第" + tickNum + "张票");
            tickNum--;
        }
        System.out.println("票卖完了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
