public class Main {
    public static void main(String[] args) {
        Beginning.createBeginning();
    }

    public static Item[] createItems() {
        Item[] itemsArray = new Item[3];
        itemsArray[0] = new Item("Sword", 5, 0, 0);
        itemsArray[1] = new Item("Shield", 0, 0, 5);
        itemsArray[2] = new Item("Spear", 0, 5, 0);
        return itemsArray;
    }

    public static Character[] createLevels() {
        Character[] levelsArray = new Character[7];
        for (int i = 0; i < levelsArray.length; i++) {
            if (i % 2 == 0) {
                levelsArray[i] = new Monster(3, 2, 6, 3);
            } else {
                levelsArray[i] = new Character(2, 2, 2, "ally");
            }
        }
        return levelsArray;
    }
}
