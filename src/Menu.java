public class Menu {
    public int num;
    public String name;
    public String desc;

    public Menu() {
    } // 생성자

    public Menu(int num, String name, String desc) {
        this.num = num;
        this.name = name;
        this.desc = desc;
    }


    @Override
    public String toString() {
        return num + ". " + name + "\t| " + desc;
    }
}
