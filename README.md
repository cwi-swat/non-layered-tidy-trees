Code accompanying the paper "Drawing Non-layered Tidy Trees in Linear Time"

This code has two changes from the paper.

Firstly, a bug in the layout algorithm was discovered by [Klortho when working on a d3 version of this algorithm](https://github.com/Klortho/d3-flextree/issues/1) which breaks aesthetic criterion. This code now incorporates the fix proposed there, namely to always move the subtree for the first contour pair. This ensures that subtree is moved the maximum of the contour pair distances, even if that maximum is *negative*, thus solving the layout issue.

Secondly, one might expect that the minimal x coordinate of the layout produced by the algorithm is zero, but there are 2 situations where this is not the case. These are caused by either have a leftmost node which is wider than its childer (positioning the node above the children will result in a negative x coordinate), or by the fix to the layout bug as described in the previous item. This version of the algorithm has a third walk which normalizes the x coordinates such that the leftmost node is at x=0.

