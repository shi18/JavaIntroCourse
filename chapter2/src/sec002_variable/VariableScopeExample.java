package sec002_variable;

public class VariableScopeExample {
    private int classVariable = 10;  // 类作用域

    public void methodWithLocalVariable() {
        int localVar = 20;  // 方法作用域

        if (true) {
            int blockVar = 30;  // 块作用域
            System.out.println("Block variable: " + blockVar);
        }

        // 下面的代码将导致编译错误，因为 blockVar 只在 if 块内可见
        //System.out.println("Block variable outside block: " + blockVar);

        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableScopeExample example = new VariableScopeExample();

        // 下面的代码将导致编译错误，因为 classVariable 是非静态的
        // System.out.println("Class variable: " + classVariable);

        System.out.println("Class variable: " + example.classVariable);

        example.methodWithLocalVariable();
    }
}
