public class NguyenTranAnhHao implements User {

    @Override
    public void reminded(String msg) {
        String userName = this.getClass().toString().replace("class ", "");
        System.out.println(userName + " - has new announcement: " + msg); 
    }
    
}
