package ss12_java_collection_framework.practice.thuc_hanh_cai_dat_bst;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}

