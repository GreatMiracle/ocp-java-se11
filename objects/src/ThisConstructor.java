
public class ThisConstructor {

    private String name;
    private int age;

    // Constructor chính
    public ThisConstructor(String name) {
        this.name = name;
    }

    // Constructor thứ hai, gọi constructor chính và thêm thông tin về tuổi.
    public ThisConstructor(String name, int age) {
        this(name); // Gọi constructor chính để thiết lập tên.
        this.age = age; // Thiết lập thông tin về tuổi.
    }

    public ThisConstructor createCopy() {
        // Gán giá trị của đối tượng hiện tại cho biến 'a'
        ThisConstructor a = this;

        // Trả về biến 'a', đó là một bản sao của đối tượng hiện tại.
        return a;
    }

    // Phương thức in thông tin của đối tượng.
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng sử dụng constructor thứ hai.
        ThisConstructor person = new ThisConstructor("John Doe", 25);

        // In thông tin của đối tượng.
        person.printDetails();


        ThisConstructor obj2 = person.createCopy();
        obj2.printDetails(); // In: Object's Name: John
    }
}