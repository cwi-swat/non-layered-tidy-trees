Code accompanying the paper "Drawing Non-layered Tidy Trees in Linear Time"

This code has two changes from the paper.

Firstly, a bug in the layout algorithm was discovered by [Klortho when working on a d3 version of this algorithm](https://github.com/Klortho/d3-flextree/issues/1) which breaks aesthetic criterion. This code now incorporates the fix proposed there, namely to always move the subtree for the first contour pair. This ensures that subtree is moved the maximum of the contour pair distances, even if that maximum is *negative*, thus solving the layout issue.

Secondly, one might expect that the minimal x coordinate of the layout produced by the algorithm is zero, but there are 2 situations where this is not the case. These are caused by either have a leftmost node which is wider than its childer (positioning the node above the children will result in a negative x coordinate), or by the fix to the layout bug as described in the previous item. This version of the algorithm has a third walk which normalizes the x coordinates such that the leftmost node is at x=0.

Other versions of the algorithm:

[d3 flextree](d3-flextree https://github.com/Klortho/d3-flextree) For the d3 javascript visualization library

[non-layered-ridy-trees.c](https://github.com/massimo-nocentini/non-layered-tidy-trees.c) Version in C

[cytoscape-tidytree](https://github.com/chuckzel/cytoscape-tidytree) A version for cytoscape.js

[entitree-flex](https://github.com/codeledge/entitree-flex) Another javascript version, also featuring side nodes

[tidytree.R](https://github.com/damiendevienne/non-layered-tidy-trees) An R version

[tidytree dart](https://github.com/teodorov/ploeg_tree_layout) Dart version

[tidy Rust](https://github.com/zxch3n/tidy) A rust version, with a nice [blog](https://www.zxch3n.com/tidy/tidy/) describing it


