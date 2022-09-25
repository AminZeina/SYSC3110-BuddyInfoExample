public class BuddyInfo {

    private String name;
    private String telephone;

    public BuddyInfo() {

    }
    public BuddyInfo(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }



    public static void main(String[] args) {

        // System.out.println("Hello world!");

        BuddyInfo buddy = new BuddyInfo("Homer", "613-123-4567");

        System.out.println("Hello " + buddy.getName());
    }
}
