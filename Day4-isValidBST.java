class Solution {
    public boolean isValid(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }

        if(min!=null && root.val <= min.val){
            return false;
        }
        if(max!=null && root.val >=max.val){
            return false;
        }

        return isValid(root.left,min,root) && isValid(root.right,root,max);

    }

    public boolean isValidBST(TreeNode root) {

        return isValid(root,null,null);
    }
}