/**
 * Created by billzhang on 2017-05-30.
 */

public class BinaryTreeMap {

    public final static int NULL_INDEX = -1;

    private final static int LEN = 100;

    private Node [] arr;
    private int first_empty_index;
    private int end_index;

    public BinaryTreeMap(){
        arr = new Node[LEN];
        first_empty_index = 0;
        end_index = 0;
    }

    // constructor: copy the content of the object 'entry' and place it at index 0 of 'arr'
    public BinaryTreeMap(Node entry){

        arr = new Node[LEN];

        arr[0] = entry;
        first_empty_index = 1;
        end_index = 1;
    }

    // find_next_empty_index(current_index) returns the first index after 'current_index' that is empty
    private int find_next_empty_index(int current_index){
        for (int i = current_index + 1; i < LEN; ++i){
            if (arr[i] == null){
                return i;
            }
        }

        return NULL_INDEX;
    }

    // expand_array() turns 'arr' into a new array with double the size of the previous one
    private void expand_array(){
        Node [] new_arr = new Node[arr.length * 2];

        for (int i = 0; i < arr.length; ++i){
            new_arr[i] = arr[i];
        }

        arr = new_arr;
    }
/*
    public void insert(Node entry, int pos){
        if (end_index == 0){
            arr[0] = entry;
            ++first_empty_index;
            ++end_index;
        }else if (entry.getKey() < arr[0]){

        }
    }

    private int arr_insert(){

    }



    // requires: nodeToBeInserted is not null
    public static BinaryTreeMap insert(BinaryTreeMap nodeToBeInserted, BinaryTreeMap rootNode){

        if (rootNode == null){
            return nodeToBeInserted;
        }

        // result stores the result of the comparison between key and rootNode
        int result = nodeToBeInserted.getKey().compareToIgnoreCase(rootNode.getKey());

        // if key of the node to be inserted comes before root node...
        if (result < 0){
            if (rootNode.getPrev() != null){
                insert(nodeToBeInserted, rootNode.getPrev());
            }else{
                rootNode.setPrev(nodeToBeInserted);
			}
        }

        // if key of the node to be inserted comes after root node...
        else if (result > 0){
            if (rootNode.getNext() != null){
                insert(nodeToBeInserted, rootNode.getNext());
            }else{
                rootNode.setNext(nodeToBeInserted);
			}
        }

        
    }

   public static BinaryTreeMap search(String key, BinaryTreeMap rootNode){

        // result stores the result of the comparison between key and rootNode
        int result = key.compareToIgnoreCase(rootNode.getKey());

        //if found...
        if (result == 0){
            return rootNode;
		}

        //if the key comes before that of rootNode...
        else if (result < 0){
            if (rootNode.getPrev() == null){
                return null;
            }else{
                return search(key, rootNode.getPrev());
			}
        }

        //if the key comes after that of rootNode...
        else {
            if (rootNode.getNext() == null){
                return null;
            }else{
                return search(key, rootNode.getNext());
        	}
		}
    }
    */

}
