package creational.prototype.as_is;

public class Character {
    private String name;
    private String job;
    private int level;

    public Character(String name, String job, int level) {
        this.name = name;
        this.job = job;
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("캐릭터{이름='%s', 직업='%s', 레벨=%d}",
                name, job, level);
    }
}