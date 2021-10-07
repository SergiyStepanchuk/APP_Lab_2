package Task2;

public class Task2
{
    public static void main(String[] args)
    {

        Stack<String> a = new Stack<String>();
        a.push("1");
        a.push("2");
        a.push("7");
        a.push("4");
        a.printStack();
        System.out.println("");
        a.pop();
        a.pop();
        a.printStack();
        System.out.print("\n");
        for (var el: a)
            System.out.print(el + " ");
        System.out.println("\n");
    }
}