import java.util.ArrayList;

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

    public static void main(String[] args) {
        System.out.println("Address Book");

        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }

}