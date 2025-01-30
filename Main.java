public class Main {
    public static void main(String[] args) {
        Character player = new Character(100, 50);

      
        for (int i = 0; i < 6; i++) {
            player.swingSword();
        }

        
        player.takeDamage(30);
        player.takeDamage(50);
        player.takeDamage(20);

        
        player.rest();

        
        System.out.println("Character's health: " + player.getHealth() + ", stamina: " + player.getStamina() + ".");
    }
}
