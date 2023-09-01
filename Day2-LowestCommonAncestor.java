class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root ==q){
            return root;
        }
        TreeNode leftLca = lowestCommonAncestor(root.left,p,q);
        TreeNode rightLca = lowestCommonAncestor(root.right,p,q);

        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;       
    }
}