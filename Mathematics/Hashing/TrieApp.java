import java.util.Scanner;

// Trie Node
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // for lowercase a-z
        isEndOfWord = false;
    }
}

// Trie class
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
        }

        node.isEndOfWord = true;
        System.out.println("Inserted: " + word);
    }

    // Search for a word in the trie
    public boolean search(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                return false;
            node = node.children[idx];
        }

        return node.isEndOfWord;
    }

    // Check if any word starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                return false;
            node = node.children[idx];
        }

        return true;
    }
}

// Main class
public class TrieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trie trie = new Trie();
        int choice;
        String word;

        do {
            System.out.println("\n--- Trie Menu ---");
            System.out.println("1. Insert word");
            System.out.println("2. Search word");
            System.out.println("3. StartsWith (prefix search)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter word to insert: ");
                    word = sc.nextLine().toLowerCase();
                    trie.insert(word);
                    break;

                case 2:
                    System.out.print("Enter word to search: ");
                    word = sc.nextLine().toLowerCase();
                    System.out.println(trie.search(word) ? "Word found." : "Word not found.");
                    break;

                case 3:
                    System.out.print("Enter prefix to search: ");
                    word = sc.nextLine().toLowerCase();
                    System.out.println(trie.startsWith(word) ? "Prefix exists." : "Prefix does not exist.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
