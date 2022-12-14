import java.util.ArrayList;

// Added this comment from GitHub as an example

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        this.buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyList.add(buddy);
        }
    }
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyList.size()) {
            return buddyList.remove(index);
        }
        return null;
    }

    public void printBuddies() {
        // new method for the testBranch
        for (BuddyInfo buddy : buddyList) {
            System.out.println(buddy.getName());
        }
    }
    public static void main(String[] args) {
        System.out.println("Address Book");

        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }

}
