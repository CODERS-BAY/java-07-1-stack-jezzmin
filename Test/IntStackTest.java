import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntStackTest {


    @Test
    public void testSize() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.size());
    }

    @Test
    public void testSizeMore() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        Assertions.assertEquals(myStack.size(), 4);
    }

    @Test
    public void testSizeZero() {
        IntStack myStack = new IntStack();

        Assertions.assertEquals(myStack.size(), 0);
    }

    @Test
    public void testPopSize() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.pop();

        Assertions.assertEquals(myStack.size(), 1);
    }

    @Test
    public void testPopElement() {
        IntStack myStack = new IntStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        Assertions.assertEquals(myStack.pop(), 3);
    }

    @Test
    public void testPeek() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(4);
        myStack.push(6);

        Assertions.assertEquals(myStack.peek(), 6);
    }

    @Test
    public void testPeekNumberTwo() {
        IntStack myStack = new IntStack();

        myStack.push(4);
        myStack.push(5);
        myStack.push(42);
        myStack.push(3);

        Assertions.assertEquals(myStack.peek(), 3);
    }

    @Test
    public void testPopIntN() {
        IntStack myStack = new IntStack();

        myStack.push(3);
        myStack.push(2);
        myStack.push(12);
        myStack.push(32);

        myStack.pop(3);
        Assertions.assertEquals(1,myStack.size());
    }

    @Test
    public void exceptionTest() {
        IntStack myStack = new IntStack();
        Assertions.assertThrows(StackToSmallException.class, () -> {
            (new IntStack()).pop();
        });
    }


}
