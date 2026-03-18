/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/


class Solution {
    public Node copyRandomList(Node head) {
        Node copy = head;
        Node outputStart = null;
        Node outputHead = null;
        Map<Node, Integer> indexNode = new HashMap<Node, Integer>();
        Map<Integer, Node> outputIndexNode = new HashMap<Integer, Node>();
        int i = 0;
        while(copy != null) {
            indexNode.put(copy, i);
            copy = copy.next;
            i++;
        }
        i = 0;
        copy = head;
        while(copy != null) {
            if(outputStart == null) {
                outputStart = new Node(copy.val);
                outputHead = outputStart;
            } else {
                outputStart.next = new Node(copy.val);
                outputStart = outputStart.next;
            }
            outputIndexNode.put(i, outputStart);
            copy = copy.next;
            i++;
        }
        copy = head;
        outputStart = outputHead;
        while(copy != null) {
            outputStart.random = outputIndexNode.get(indexNode.get(copy.random));
            outputStart = outputStart.next;
            copy = copy.next;
        }
        return outputHead;
    }
}

//best solution..
//just map the oldNode and newNode to fillup randomNodes
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        Node copy = head;
        Node outputStart = null;
        Node outputHead = null;
        Map<Node, Node> nodeNewNodeMap = new HashMap<Node, Node>();
        copy = head;
        while(copy != null) {
            if(outputStart == null) {
                outputStart = new Node(copy.val);
                outputHead = outputStart;
            } else {
                outputStart.next = new Node(copy.val);
                outputStart = outputStart.next;
            }
            nodeNewNodeMap.put(copy, outputStart);
            copy = copy.next;
        }
        copy = head;
        outputStart = outputHead;
        while(copy != null) {
            outputStart.random = nodeNewNodeMap.get(copy.random);
            outputStart = outputStart.next;
            copy = copy.next;
        }
        return outputHead;
    }
}