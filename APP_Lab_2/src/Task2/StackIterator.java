package Task2;

import java.util.Iterator;

public class StackIterator<Type> implements Iterator<Type>
{
    private StackElement<Type> cur;
    public StackIterator(StackElement<Type> start)
    {
        cur = start;
    }

    @Override
    public boolean hasNext()
    {
        return cur != null;
    }

    @Override
    public Type next()
    {
        var val = cur.value;
        cur = cur.next;
        return val;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
