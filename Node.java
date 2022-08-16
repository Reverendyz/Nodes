public class Node {
  private Node right;
  private Node left;
  private Node parent;
  private int value;

  public Node(int value){
    this.parent = null;
    this.left = null;
    this.right = null;
    this.value = value;
  }

  public Node getRight(){
    return this.right;
  }
  public Node getLeft() {
    return left;
  }
  public Node getParent() {
    return parent;
  }
  public void setParent(Node parent) {
    this.parent = parent;
  }
  public void setLeft(Node left) {
    this.left = left;
  }
  public void setRight(Node right) {
    this.right = right;
  }
  public int getValue() {
    return value;
  }
}
