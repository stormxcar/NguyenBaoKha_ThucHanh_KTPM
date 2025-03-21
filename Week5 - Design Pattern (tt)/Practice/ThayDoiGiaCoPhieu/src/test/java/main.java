import org.example.Investor;
import org.example.Stock;
import org.example.Task;
import org.example.TeamMember;

public class main {
    public static void main(String[] args) {
        // Demo Stock Price Monitoring
        System.out.println("=== Demo Theo dõi giá cổ phiếu ===");
        Stock vnIndex = new Stock("VN-Index", 1000);

        Investor investor1 = new Investor("Nguyễn Văn A");
        Investor investor2 = new Investor("Trần Thị B");

        vnIndex.attach(investor1);
        vnIndex.attach(investor2);

        vnIndex.setPrice(1050);

        System.out.println("\n=== Demo Quản lý công việc ===");
        Task task = new Task("Phát triển tính năng mới");

        TeamMember member1 = new TeamMember("Hoàng Văn X");
        TeamMember member2 = new TeamMember("Lê Thị Y");

        task.attach(member1);
        task.attach(member2);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
