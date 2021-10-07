package Task2;

import java.util.Iterator;

public class Stack<Type> implements Iterable<Type>
{
    private StackElement<Type> head;

    public void push(Type value)
    {
        StackElement<Type> a = new StackElement<Type>();
        a.value = value;

        if (head == null) {
            head = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    void printStack()
    {
        StackElement<Type> t = head;
        while (t != null)
        {
            System.out.print(t.value + " ");
            t = t.next;
        }
    }

    void pop()
    {
        if (head == null)
            return;

        if (head.next == null)
            head = null;
        else
            head = head.next;
    }

    @Override
    public Iterator<Type> iterator()
    {
        return new StackIterator<Type>(head);
    }
}