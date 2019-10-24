public class Testing {
    public static void main(String[] args) {
        Stacking a = new Stacking(4);
        a.push(30,"Gula","Jalan Subrantas");
        a.push(15,"Beras","Jalan Subrantas");
        a.push(3,"Handphone","Jalan Subrantas");
        a.push(5,"AirMineral","Jalan Subrantas");

        a.print();
        System.out.println("=========================");
        System.out.println("Pop ="+a.pop().nama);
        System.out.println("=========================");

        a.print();
    }
}
