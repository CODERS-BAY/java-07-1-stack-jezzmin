import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class IntStack {

    private List<Integer> element = new ArrayList<>();

    public void push (int newElement) {
       element.add(newElement);
    }

    public int size() {
        return element.size();
    }

    public int pop() {
        int popElement = element.get(element.size() - 1);
        element.remove(element.size() - 1);

        if (element.size() == 0) {
            throw new StackToSmallException();
        }
        return popElement;
    }

    public int peek() {

        if (element.size() == 0) {
            throw new StackToSmallException();
        }
        return element.get(element.size() -1);
    }

    public int [] pop(int n) {
        int[] toReturn = new int[element.size()];
        for (int i = 0; i < n ; i++) {
            toReturn[i] = pop();
        }
        return toReturn;
    }


}
