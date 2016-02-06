   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       Queue<Node> queue= new LinkedList<Node>();
       queue.add(root);
       while(!queue.isEmpty())
           {
           Node tmp= queue.poll();
           System.out.print(tmp.data+" ");
           if(tmp.left!=null)
           {
               queue.add(tmp.left);
           }
           if(tmp.right!=null)
              {
               queue.add(tmp.right);
            }
       }
          
      
    }

