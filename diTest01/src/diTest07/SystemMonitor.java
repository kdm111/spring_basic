package diTest07;

public class SystemMonitor {
    private int periodTime;
    private SmsSender smsSender;

    public SystemMonitor() {
    }

    public int getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(int periodTime) {
        this.periodTime = periodTime;
    }

    public SmsSender getSmsSender() {
        return smsSender;
    }

    public void setSmsSender(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void monitor() {
        System.out.println(this.periodTime + " 간격 모니터링...");
        this.smsSender.send();
        System.out.println("------------");
    }
}