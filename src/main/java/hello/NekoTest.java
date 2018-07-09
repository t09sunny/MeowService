package hello;

public class NekoTest {

    private String name;
    private int age;

    public NekoTest(){};
    public NekoTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
