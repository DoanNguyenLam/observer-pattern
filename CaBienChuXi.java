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
    public void detach(User user) {
        userList.remove(user);
    }

    @Override
    public void thongBaoTraTien(Long money) {
        System.out.println("Hom nay co: " + userList.size() + " nguoi dat com");
        for (User u: userList) {
            String userName = u.getClass().toString().replace("class ", "");
            System.out.println("Dat com cho: " + userName);
        }

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String strFormat = numberFormat.format(money);
        for (User u: userList) {
            u.reminded("Please give me " + strFormat + " VND back");
        }
    }    
}
