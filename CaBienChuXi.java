import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CaBienChuXi implements ChuXi {

    private List<User> userList = new ArrayList<>();

    @Override
    public void datCom(User user) {
        userList.add(user);
    }

    @Override
    public void paid(User user) {
        String userName = user.getClass().toString().replace("class ", "");
        System.out.println(userName + " - đã trả tiền !!!!");
        System.out.println("\t\t-------------\n");
        userList.remove(user);
    }

    @Override
    public void thongBaoTraTien(Long money) {
        System.out.println("Hôm nay có: " + userList.size() + " người đặt cơm");
        for (User u: userList) {
            String userName = u.getClass().toString().replace("class ", "");
            System.out.println("\tĐặt cơm cho: " + userName);
        }

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String strFormat = numberFormat.format(money);

        System.out.println("\n\t******** Đòi nợ time ********");
        for (User u: userList) {
            u.notify("Làm ơn trả " + strFormat + " VND lại cho Cá Biển !");
        }
    }    
}
