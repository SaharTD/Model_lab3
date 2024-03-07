/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_3Model;

/**
 *
 * @author User
 */
// Prototype interface representing level templates
// Prototype interface representing level templates
interface PlayerLevel extends Cloneable {
    PlayerLevel clone();
    void customizeLevel(String terrain, String obstacles, String enemies);
}

// Concrete implementation of the Prototype pattern for a Level
class Level implements PlayerLevel {
    private String terrain;
    private String obstacles;
    private String enemies;

    public Level(String terrain, String obstacles, String enemies) {
        this.terrain = terrain;
        this.obstacles = obstacles;
        this.enemies = enemies;
    }

    @Override
    public PlayerLevel clone() {
        try {
            return (PlayerLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void customizeLevel(String terrain, String obstacles, String enemies) {
         this.terrain = terrain;
            this.obstacles = obstacles;
            this.enemies = enemies;
            System.out.println("Game Level: Terrain : " + terrain + ", Obstacles : " + obstacles + ", Enemies : " + enemies);
    }

 
    }

  
   


public class GameLevel {
    public static void main(String[] args) {
        PlayerLevel newLevel = new Level("Default terrain", "Default obstacles", "Default enemies");

        PlayerLevel level1 = newLevel.clone();
        level1.customizeLevel("Swamp", "Mud", "Alligator");

        PlayerLevel level2 = newLevel.clone();
        level2.customizeLevel("Sand Dunes", "Cactus", "Scorpion");

        PlayerLevel level3 = newLevel.clone();
        level3.customizeLevel("Ice Cave", "Icicle", "Yeti");
    }
}
