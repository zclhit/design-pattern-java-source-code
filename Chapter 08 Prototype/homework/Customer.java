public class Customer {
    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        Address add = new Address();
        add.setAddNo("aaa");
        c.setAddr(add);
        Address add2 = c.getAddr().clone();
        System.out.println(add == add2);
    }
}
