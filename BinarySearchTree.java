import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class BinarySearchTree {

  private static int NODE_AMOUNT = 10;
  private static List<Node> nodeList = new ArrayList<Node>();
  public static void main(String[] args) {


    RandGen();
    CreateTree(nodeList);


  }

  public static void RandGen(){
    Random generator = new Random();

    for(int i = 0; i < NODE_AMOUNT; i++){
      int number = generator.nextInt(100);
      nodeList.add(new Node(number));
      if (i != 0){
        
      }
    }
  }
  public static void NodeSorter(List<Node> nodeList){
    nodeList.stream().forEach(p -> {
      if(p.getParent() == null){
        
      }
    });
  }
}
