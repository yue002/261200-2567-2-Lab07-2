public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        if (stamina >= 10) {
            stamina -= 10;
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        } else {
            stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        if (damageAmount > 0) {
            health -= damageAmount;
            if (health <= 0) {
                health = 0;
                System.out.println("Character is dead.");
            } else {
                System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
            }
        }
    }

    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
