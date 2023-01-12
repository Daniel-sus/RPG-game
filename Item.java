public class Item {
    String name;
    int incStamina;
    int incMana;
    int incHp;

    public Item(String name, int incStamina, int incMana, int incHp) {
        this.name = name;
        this.incStamina = incStamina;
        this.incMana = incMana;
        this.incHp = incHp;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("boost stamina: " + incStamina);
        System.out.println("boost mana: " + incMana);
        System.out.println("boost hp: " + incHp);
    }
}