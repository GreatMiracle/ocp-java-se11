interface Interface1 {
    default void commonMethod() {
        System.out.println("Method in Interface1");
    }
}

interface Interface2 {
    default void commonMethod() {
        System.out.println("Method in Interface2");
    }
}

// Không đảm bảo thứ tự khi gọi phương thức
class MyClass implements Interface1, Interface2 {
    void testMethodsOrder() {
        Interface1.super.commonMethod(); // Lỗi: Không rõ gọi phương thức nào
    }

    @Override
    public void commonMethod() {
        Interface1.super.commonMethod();
    }
}