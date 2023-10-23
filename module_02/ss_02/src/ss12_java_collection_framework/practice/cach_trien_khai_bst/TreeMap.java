package ss12_java_collection_framework.practice.cach_trien_khai_bst;

public class TreeMap<E> {
    protected E element;
    protected TreeMap<E> left;
    protected TreeMap<E> right;
//    protected TreeNode<E> root;

    public TreeMap(E e) {
        element = e;
    }

    //tim kiem tren bst
//    public boolean search (E element){
//        TreeNode<E> current = root;
//        while (current!= null){
//            if (element < current.element){
//                current = current.left;
//            }else if (element > current.element){
//                current = current.right;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
    public static void main(String[] args) {
        TreeMap<Integer> root = new TreeMap<>(60);
        root.left = new TreeMap<>(55);
        root.right = new TreeMap<>(100);
    }
}
