class Main {
    public static void main(String[] args) {
        System.out.println("******************** START ********************\n");
        CaBienChuXi caBien = new CaBienChuXi();
        User user1 = new NguyenVietTrung();
        User user2 = new NguyenTranAnhHao();
        User user3 = new DoMinhLam();

        System.out.println("\t******** Day 1 ********");
        caBien.datCom(user1);
        caBien.thongBaoTraTien(Long.valueOf(10000));

        System.out.println("\n\t******** Day 2 ********");
        caBien.datCom(user2);
        caBien.datCom(user3);
        caBien.thongBaoTraTien(Long.valueOf(20000));

        System.out.println("\n******************** END ********************");
    }
}