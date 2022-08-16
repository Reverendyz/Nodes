import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryTreeSorter {
  
  private static int NODE_AMOUNT = 10;
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_YELLOW = "\u001B[32m";
  public static void main(String[] args) {
    
    printNodes();
    
  }
  public static void printNodes(){
    List<Node> nodes = SortNodes();
    nodes.stream().forEach(p -> {
      System.out.println("Value = " + p.getValue());
      if(p.getLeft() != null)
        System.out.println("\t-Left Value = " +ANSI_YELLOW+  p.getLeft().getValue() + ANSI_RESET);
      if(p.getRight() != null)
        System.out.println("\t\t-Right Value = " +ANSI_YELLOW+ p.getRight().getValue() + ANSI_RESET);
      if(p.getParent() != null)
        System.out.println("\t\t\t-Parent Value = " +ANSI_YELLOW+ p.getParent().getValue() + ANSI_RESET);
      
      

    });
  }
  private static List<Node> SortNodes(){
    List<Node> nodes = RandGen();

    Node prev = null;
    for(int i = 0; i < nodes.size(); i++){
      if(i == 0){
        prev = nodes.get(i);
        continue;
      }
      if(nodes.get(i).getValue() >= prev.getValue()){
        prev.setRight(nodes.get(i));
        nodes.get(i).setParent(prev);
      }
      if(nodes.get(i).getValue() < prev.getValue()){
        prev.setLeft(nodes.get(i));
        nodes.get(i).setParent(prev);
      }
      prev = nodes.get(i);
    }
    return nodes;
  }
  private static List<Node> RandGen(){
    Random generator = new Random();
    List<Node> nodeList = new ArrayList<Node>();
    for(int i = 0; i < NODE_AMOUNT; i++){
      int number = generator.nextInt(100);
      Node node = new Node(number);
      nodeList.add(node);
    }
    return nodeList;
  }
}
