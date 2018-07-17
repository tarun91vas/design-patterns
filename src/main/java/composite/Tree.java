package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree {
    String name;
    List<Tree> children = new ArrayList<>();

    Tree (String name) {
        this.name = name;
    }

    public void addChild(Tree t) {
        this.children.add(t);
    }

    public void printTree() {
        System.out.println(this.name);
        System.out.println("-----------");

        Iterator<Tree> it = this.children.iterator();
        while(it.hasNext()) {
            Tree t = it.next();
            t.printTree();
        }
    }

    public static void main(String[] args) {
        Tree ltD = new Tree("D");
        Tree ltE = new Tree("E");
        Tree ltF = new Tree("F");
        Tree ltG = new Tree("G");

        Tree treeB = new Tree("B");
        treeB.addChild(ltD);
        treeB.addChild(ltE);

        Tree treeC = new Tree("C");
        treeC.addChild(ltF);
        treeC.addChild(ltG);

        Tree treeA = new Tree("A");
        treeA.addChild(treeB);
        treeA.addChild(treeC);

        treeA.printTree();
    }
}
