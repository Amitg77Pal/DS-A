import java.util.Scanner;

class SplayTree {
    // Node class
    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    private Node root;

    public SplayTree() {
        root = null;
    }

    // Right rotate (Zig Rotation)
    private Node rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        return y;
    }

    // Left rotate (Zag Rotation)
    private Node leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        return y;
    }

    // Splay operation
    private Node splay(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        // Key lies in left subtree
        if (key < root.key) {
            if (root.left == null) return root;

            // Zig-Zig (Left Left)
            if (key < root.left.key) {
                root.left.left = splay(root.left.left, key);
                root = rightRotate(root);
            }
            // Zig-Zag (Left Right)
            else if (key > root.left.key) {
                root.left.right = splay(root.left.right, key);
                if (root.left.right != null)
                    root.left = leftRotate(root.left);
            }

            return (root.left == null) ? root : rightRotate(root);
        }
        // Key lies in right subtree
        else {
            if (root.right == null) return root;

            // Zag-Zig (Right Left)
            if (key < root.right.key) {
                root.right.left = splay(root.right.left, key);
                if (root.right.left != null)
                    root.right = rightRotate(root.right);
            }
            // Zag-Zag (Right Right)
            else if (key > root.right.key) {
                root.right.right = splay(root.right.right, key);
                root = leftRotate(root);
            }

            return (root.right == null) ? root : leftRotate(root);
        }
    }

    // Insert operation
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        root = splay(root, key);

        if (root.key == key) return;

        Node newNode = new Node(key);

        if (key < root.key) {
            newNode.right = root;
            newNode.left = root.left;
            root.left = null;
        } else {
            newNode.left = root;
            newNode.right = root.right;
            root.right = null;
        }

        root = newNode;
    }

    // Search operation
    public boolean search(int key) {
        root = splay(root, key);
        return root != null && root.key == key;
    }

    // Delete operation
    public void delete(int key) {
        if (root == null) return;

        root = splay(root, key);

        if (root.key != key) return;

        if (root.left == null) {
            root = root.right;
        } else {
            Node temp = root.right;
            root = splay(root.left, key);
            root.right = temp;
        }
    }

    // Inorder traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public void display() {
        if (root == null) {
            System.out.println("Tree is empty.");
        } else {
            System.out.print("Inorder Traversal: ");
            inorder(root);
            System.out.println();
        }
    }

    // Get root node
    public Node getRoot() {
        return root;
    }

    // Main function
    public static void main(String[] args) {
        SplayTree tree = new SplayTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSplay Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    tree.delete(deleteValue);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    if (tree.search(searchValue)) {
                        System.out.println("Found " + searchValue);
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 4:
                    tree.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
