package ss11_stack_queue_java.exc.bai_tap_dao_nguoc_element_trong_array_stack;


import java.util.Stack;

public class ReverseTheString {
    public static void main(String[] args) {

        Stack<String> mWord = new Stack<>();
        Stack<String> wStack = new Stack<>();
        String words;
        mWord.add("Vtran");
        mWord.add("Latiah");
        mWord.add("Hn");
        mWord.add("AnhDo");
        int size = mWord.size();
        System.out.println(mWord);
        for (int i = 0; i < size; i++) {
            words = mWord.pop();
            wStack.add(words);
        }
        System.out.println(wStack);
    }
}
