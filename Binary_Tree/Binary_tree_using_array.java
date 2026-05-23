package Binary_Tree;

import java.util.Scanner;

public class Binary_tree_using_array {
    public Binary_tree_using_array(int size) {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node root;

    // insert method
    public void poppulate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        poppulate(scanner, root);
    }

    private void poppulate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the values of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            poppulate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the values of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            poppulate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, "", true);
    }

    private void prettyDisplay(Node node, String indent, boolean last) {
        if (node == null) {
            return;
        }

        System.out.print(indent);
        if (last) {
            System.out.print("└── ");
            indent += "    ";
        } else {
            System.out.print("├── ");
            indent += "│   ";
        }
        System.out.println(node.value);
        prettyDisplay(node.left, indent, false);
        prettyDisplay(node.right, indent, true);
    }

}