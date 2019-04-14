public class Address implements Cloneable {
        private String addNo;
        public Address clone(){
            Address add = null;
            try {
                add = (Address)super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("class not cloneable.");
            }
            return add;
        }

        public String getAddNo() {
            return addNo;
        }

        public void setAddNo(String addNo) {
            this.addNo = addNo;
        }
}
