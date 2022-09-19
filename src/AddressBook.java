import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        this.buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);

    }
    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}