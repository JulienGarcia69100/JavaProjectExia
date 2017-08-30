

public class Jellyfish {
    private String specie;
    private int food_level;
    private int satiety;
    private int life;
    private int birth_delay;
    
    public Jellyfish(String specie, int food_level, int satiety, int life, int birth_delay)
    {
        this.specie = specie;
        this.food_level = food_level;
        this.satiety = satiety;
        this.life = life;
        this.birth_delay = birth_delay;
    }
    
    public String getSpecie() {
            return specie;
    }

    public void setSpecie(String specie) {
            this.specie = specie;
    }

    public int getFood_level() {
            return food_level;
    }

    public void setFood_level(int food_level) {
            this.food_level = food_level;
    }

    public int getSatiety() {
            return satiety;
    }

    public void setSatiety(int satiety) {
            this.satiety = satiety;
    }

    public int getLife() {
            return life;
    }

    public void setLife(int life) {
            this.life = life;
    }

    public int getBirth_delay() {
            return birth_delay;
    }

    public void setBirth_delay(int birth_delay) {
            this.birth_delay = birth_delay;
    }
}