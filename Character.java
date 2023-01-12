public class Character {
    private String role;
    private int stamina;
    private int mana;
    private int hp;
    private Item[] items;

    public Character(int stamina, int mana, int hp, String role) {
        this.role = role;
        this.stamina = stamina;
        this.mana = mana;
        this.hp = hp;
        this.items = new Item[0];
    }

    public void addItem(Item item) {
        Item[] newArray = new Item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }
        newArray[newArray.length - 1] = item;
        this.items = newArray;
    }

    public Item[] getItem() {
        return this.items;
    }

    public void getStats() {
        switch (role) {
            case "ally":
                System.out.println("ALLY");
                break;
            case "monster":
                System.out.println("MONSTER");
                break;
            case "main":
                System.out.println("YOUR CHARACTER");
                break;
        }
        System.out.println("stamina: " + stamina);
        System.out.println("mana: " + mana);
        System.out.println("hp: " + hp);
        System.out.println();
        for (int i = 0; i < items.length; i++) {
            System.out.println("YOUR ITEM: " + (i + 1));
            this.items[i].getInfo();
            System.out.println();
        }
    }
}
