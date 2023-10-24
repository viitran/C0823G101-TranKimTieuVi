package ss12_java_collection_framework.practice.thuc_hanh_cai_dat_bst;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
}
