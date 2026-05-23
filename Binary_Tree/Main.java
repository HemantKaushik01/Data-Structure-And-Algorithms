package Binary_Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_tree_using_array tree = new Binary_tree_using_array(5);
        tree.poppulate(sc);
        // tree.display();
        tree.prettyDisplay();
    }
}
