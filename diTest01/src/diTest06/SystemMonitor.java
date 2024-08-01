package diTest06;

public class SystemMonitor {
    private int periodTime;

    // 기본 생성자 추가
    public SystemMonitor() {
    }

    // 기존 생성자 유지
    public SystemMonitor(int periodTime) {
        this.periodTime = periodTime;
    }

    // setter 메소드 추가
    public void setPeriodTime(int periodTime) {
        this.periodTime = periodTime;
    }

    public void monitor() {
        System.out.println(this.periodTime + " 간격으로 모니터링한다.");
    }
}