/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */ 
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return -1;
        }
                int minValue = root.val;
        int secondMinValue = findSecondMinHelper(root, minValue);
        
        return secondMinValue;
    }
    
    private int findSecondMinHelper(TreeNode node, int minValue) {
        if (node == null) {
            return -1; 
        }

        if (node.val > minValue) {
            return node.val;
        }

        int left = findSecondMinHelper(node.left, minValue);
        int right = findSecondMinHelper(node.right, minValue);

        if (left != -1 && right != -1) {
            return Math.min(left, right); 
        } else if (left != -1) {
            return left; 
        } else {
            return right; 
        }
    }
}