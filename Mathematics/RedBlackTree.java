import java.util.Scanner;

class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    class Node {
        int data;
        Node left, right, parent;
        boolean color;

        public Node(int data) {
            this.data = data;
            left = right = parent = null;
            color = RED;
        }
    }

    private Node root;
    private final Node NIL;

    public RedBlackTree() {
        NIL = new Node(-1);
        NIL.color = BLACK;
        root = NIL;
    }

    // Left rotate
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != NIL) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == NIL) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // Right rotate
    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != NIL) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == NIL) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // Fix Red-Black properties after insertion
    private void fixInsert(Node z) {
        while (z.parent.color == RED) {
            if (z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right;
                if (y.color == RED) { // Case 1: Uncle is red
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) { // Case 2: z is a right child
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.color = BLACK; // Case 3: z is a left child
                    z.parent.parent.color = RED;
                    rightRotate(z.parent.parent);
                }
            } else {
                Node y = z.parent.parent.left;
                if (y.color == RED) { // Case 1: Uncle is red
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) { // Case 2: z is a left child
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.color = BLACK; // Case 3: z is a right child
                    z.parent.parent.color = RED;
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.color = BLACK;
    }

    // Insert operation
    public void insert(int key) {
        Node z = new Node(key);
        Node y = NIL;
        Node x = root;

        while (x != NIL) {
            y = x;
            if (z.data < x.data)
                x = x.left;
            else
                x = x.right;
        }

        z.parent = y;
        if (y == NIL)
            root = z;
        else if (z.data < y.data)
            y.left = z;
        else
            y.right = z;

        z.left = NIL;
        z.right = NIL;
        z.color = RED;

        fixInsert(z);
    }

    // Search operation
    public boolean search(int key) {
        return searchHelper(root, key) != NIL;
    }

    private Node searchHelper(Node node, int key) {
        if (node == NIL || key == node.data)
            return node;

        if (key < node.data)
            return searchHelper(node.left, key);
        else
            return searchHelper(node.right, key);
    }

    // Fix Red-Black properties after deletion
    private void fixDelete(Node x) {
        while (x != root && x.color == BLACK) {
            if (x == x.parent.left) {
                Node w = x.parent.right;
                if (w.color == RED) { // Case 1
                    w.color = BLACK;
                    x.parent.color = RED;
                    leftRotate(x.parent);
                    w = x.parent.right;
                }
                if (w.left.color == BLACK && w.right.color == BLACK) { // Case 2
                    w.color = RED;
                    x = x.parent;
                } else {
                    if (w.right.color == BLACK) { // Case 3
                        w.left.color = BLACK;
                        w.color = RED;
                        rightRotate(w);
                        w = x.parent.right;
                    }
                    w.color = x.parent.color; // Case 4
                    x.parent.color = BLACK;
                    w.right.color = BLACK;
                    leftRotate(x.parent);
                    x = root;
                }
            } else {
                Node w = x.parent.left;
                if (w.color == RED) { // Case 1
                    w.color = BLACK;
                    x.parent.color = RED;
                    rightRotate(x.parent);
                    w = x.parent.left;
                }
                if (w.right.color == BLACK && w.left.color == BLACK) { // Case 2
                    w.color = RED;
                    x = x.parent;
                } else {
                    if (w.left.color == BLACK) { // Case 3
                        w.right.color = BLACK;
                        w.color = RED;
                        leftRotate(w);
                        w = x.parent.left;
                    }
                    w.color = x.parent.color; // Case 4
                    x.parent.color = BLACK;
                    w.left.color = BLACK;
                    rightRotate(x.parent);
                    x = root;
                }
            }
        }
        x.color = BLACK;
    }

    // Delete operation
    public void delete(int key) {
        Node z = searchHelper(root, key);
        if (z == NIL) return;

        Node y = z, x;
        boolean yOriginalColor = y.color;

        if (z.left == NIL) {
            x = z.right;
            transplant(z, z.right);
        } else if (z.right == NIL) {
            x = z.left;
            transplant(z, z.left);
        } else {
            y = minimum(z.right);
            yOriginalColor = y.color;
            x = y.right;
            if (y.parent == z)
                x.parent = y;
            else {
                transplant(y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(z, y);
            y.left = z.left;
            y.left.parent = y;
            y.color = z.color;
        }

        if (yOriginalColor == BLACK)
            fixDelete(x);
    }

    private void transplant(Node u, Node v) {
        if (u.parent == NIL)
            root = v;
        else if (u == u.parent.left)
            u.parent.left = v;
        else
            u.parent.right = v;
        v.parent = u.parent;
    }

    private Node minimum(Node node) {
        while (node.left != NIL)
            node = node.left;
        return node;
    }

    // Inorder traversal
    public void inorder(Node node) {
        if (node != NIL) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void display() {
        inorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.Insert 2.Delete 3.Search 4.Display 5.Exit: ");
            int choice = sc.nextInt();
            if (choice == 5) break;
            int val;
            switch (choice) {
                case 1: val = sc.nextInt(); tree.insert(val); break;
                case 2: val = sc.nextInt(); tree.delete(val); break;
                case 3: val = sc.nextInt(); System.out.println(tree.search(val) ? "Found" : "Not Found"); break;
                case 4: tree.display(); break;
            }
        }
        sc.close();
    }
}
