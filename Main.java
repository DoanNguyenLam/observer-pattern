class Main {
    public static void main(String[] args) {
        System.out.println("******************** START ********************\n");
        CaBienChuXi caBien = new CaBienChuXi();
        User user1 = new NguyenTranAnhHao();
        User user2 = new NguyenVietTrung();
        User user3 = new LeVanNhat();

        System.out.println("\t******** Yesterday ********");
        caBien.datCom(user1);
        caBien.thongBaoTraTien(Long.valueOf(34000));

        System.out.println("\n\t******** Today ********");
        caBien.datCom(user2);
        caBien.datCom(user3);
        caBien.thongBaoTraTien(Long.valueOf(30000));
        System.out.println("\n\t******** Đã thanh toán ********");
        caBien.paid(user2);
        caBien.thongBaoTraTien(Long.valueOf(30000));
        System.out.println("\n******************** END ********************");
    }
}