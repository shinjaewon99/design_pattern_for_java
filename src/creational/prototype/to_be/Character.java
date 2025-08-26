package creational.prototype.to_be;

public class Character implements Cloneable{
    private String name;
    private String job;
    private int level;

    public Character(String name, String job, int level) {
        this.name = name;
        this.job = job;
        this.level = level;
    }

    // clone 메서드 구현
    @Override
    public Character clone() {
        try {
            return (Character) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("클론 에러", e);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("캐릭터{이름='%s', 직업='%s', 레벨=%d}",
                name, job, level);
    }
}