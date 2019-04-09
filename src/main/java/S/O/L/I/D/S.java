package S.O.L.I.D;

public abstract class S {
    //classes should have one and only one reason to change
    private int age;
    private String name;
    private String sex;
    private String eyeColor;

    //This S "person" class has a single responsibility of maintaining simple person attributes

    //getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //methods
    public abstract void speak();
}
