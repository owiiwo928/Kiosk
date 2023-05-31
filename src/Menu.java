import java.util.ArrayList;
import java.util.List;

public class Menu {
    public int num;
    public String name;
    public String desc;

    public Menu() {
    }; // 생성자

    public Menu(int num, String name, String desc) {
        this.num = num;
        this.name = name;
        this.desc = desc;
    }

    public void getMenuList() {
        System.out.println(this.num + ". " + this.name + "|" + this.desc);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return num + ". " + name + "\t| " + desc;
    }
}
