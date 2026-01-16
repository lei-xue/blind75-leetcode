/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
 /* 
递归DFS核心思想（背下来）

两个都空 → true
一个空一个不空 → false
值不一样 → false
左子树 && 右子树 都一样 → true
 */
var isSameTree = function(p, q) {
    if(p === null && q === null) return true;
    if(p === null || q === null) return false;
    if(p.val !== q.val) return false;

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};