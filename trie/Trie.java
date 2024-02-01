package trie;
public class Trie {
//a-z A-Z #== 256


    static  class Node {
        public static final int NODE_LIMIT = 26;
        boolean endOfWord ;
        Node[] children = new Node[26];
        public Node(){
            for(int index = 0; index < NODE_LIMIT; index++) {
                assert false;
                children[index] = null;
            }
           // endOfWord = false;
        }
    }
    static Node rootNode = new Node();

    public static void insertNode(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = rootNode;
        for(; level<len; level++) {
            idx = word.charAt(level)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }




    public static boolean search(String key) { //O(n)
        int level = 0;
        int len = key.length();
        int idx = 0;


        Node curr = rootNode;
        for(; level<len; level++) {
            idx = key.charAt(level)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }

    //avl=  balanced Tree  =  O(logn)
    //Tries  O(L) L is word Length
    public static boolean wordBreak(String key) {
        int len = key.length();


        if(len == 0) {
            return true;
        }


        for(int i=1; i<=len; i++) {
            if( search(key.substring(0, i)) &&
                    wordBreak(key.substring(i)) ) {
                return true;
            }
        }


        return false;
    }
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder curr) {


        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].endOfWord) {
                curr.append((char)(i+'a'));
                if(curr.length() > ans.length()) {
                    ans = curr.toString();
                }
                longestWord(root.children[i], curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
    public static void buildTrie(String str) {
        //insert all suffixes to Trie
        rootNode = new Node();
        for(int i=0; i<str.length(); i++) {
            insertNode(str.substring(i));
        }
    }


    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }


        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.children[i] != null) {
                count+= countNodes(root.children[i]);
            }
        }
        return 1+count; //extra one for the self node
    }

    public static boolean startsWith(String prefix) {
        Node curr = rootNode;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};
        //Insert => O(N)   length of string
        for (String word : words) {
            insertNode(word);
            System.out.println("inserted " + word);
        }



        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));


        System.out.println(startsWith("the"));
        System.out.println(startsWith("thi"));
    }
}
