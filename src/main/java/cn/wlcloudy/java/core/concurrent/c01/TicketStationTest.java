package cn.wlcloudy.java.core.concurrent.c01;

/**
 * @author: X.Tony
 */
public class TicketStationTest {
    public static void main(String[] args) {
        //实例化站台对象，并为每一个站台取名字
        TicketStation station1=new TicketStation("窗口1");
        TicketStation station2=new TicketStation("窗口2");
        TicketStation station3=new TicketStation("窗口3");
        // 让每一个站台对象各自开始工作
        station1.start();
        station2.start();
        station3.start();


        /*
            测试结果：
            窗口1卖出了第20张票
            窗口3卖出了第19张票
            窗口2卖出了第18张票
            窗口1卖出了第17张票
            窗口3卖出了第16张票
            窗口2卖出了第15张票
            窗口1卖出了第14张票
            窗口3卖出了第13张票
            窗口2卖出了第12张票
            窗口1卖出了第11张票
            窗口3卖出了第10张票
            窗口2卖出了第9张票
            窗口1卖出了第8张票
            窗口3卖出了第7张票
            窗口2卖出了第6张票
            窗口1卖出了第5张票
            窗口3卖出了第4张票
            窗口2卖出了第3张票
            窗口1卖出了第2张票
            窗口3卖出了第1张票
            票卖完了
         */
    }
}
