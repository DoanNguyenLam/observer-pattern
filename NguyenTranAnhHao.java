public class NguyenTranAnhHao implements User {

    @Override
    public void notify(String msg) {
        String userName = this.getClass().toString().replace("class ", "");
        System.out.println(userName + " - có thông báo đòi nợ: " + msg); 
    }
    
}
