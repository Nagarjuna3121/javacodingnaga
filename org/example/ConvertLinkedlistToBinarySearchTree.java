package org.example;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class ConvertLinkedlistToBinarySearchTree {

    private ListNode head;

    public TreeNode convertToBST(ListNode head) {
        this.head = head;
        int size = getSize(head);
        return buildBST(0, size - 1);
    }
        private TreeNode buildBST(int start,int end){
            if (start > end)
                return null;
            int mid = start + (end - start) / 2;

            TreeNode left = buildBST(start, mid - 1);

            TreeNode root = new TreeNode(head.data);
            root.left = left;

            // Move list pointer
            head = head.next;

            // Build right subtree
            root.right = buildBST(mid + 1, end);

            return root;
        }
            private int getSize(ListNode node) {
                int count = 0;
                while (node != null) {
                    count++;
                    node = node.next;
                }
                return count;
            }

    public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Pre-order traversal
    public void preorderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ConvertLinkedlistToBinarySearchTree converter = new ConvertLinkedlistToBinarySearchTree();
        TreeNode root = converter.convertToBST(head);

        System.out.println("In-order Traversal of BST:");
        converter.inorderTraversal(root);  // Sorted output

        System.out.println("\nPre-order Traversal of BST:");
        converter.preorderTraversal(root);
    }
        }



