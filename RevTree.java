class Node 
{ 
 int data; 
 Node l, r;
 
  public Node(int o) 
 { 
  data=o; 
    l=null;
r=null; 
   } 
} 
  
class RevTree 
{ 
    
 Node root; 
  
    public RevTree() 
    { 
        root = null; 
 } 
  
    
 void treeprint() 
 { 
 int h = height(root); 
 int i; 
 for (i=h; i>=1; i--) 
  treeprint(root, i); 
    } 
  
    
 int height(Node root) 
  { 
   if (root == null) 
           return 0; 
   else
    { 
           
      int lh= height(root.l);
      int rh= height(root.r); 
              
            
    if (lh> rh) 

   return(lh+1); 

  else return(rh+1);  
 } 
} 
  
    
 void treeprint(Node root ,int lev)   { 
    if (root == null) 
       return; 
   if (lev== 1) 
  System.out.print(root.data + " "); 
  else if (lev>1) 
  { 
    treeprint(root.l, lev-1); 
    treeprint(root.r, lev-1); 
  } 
 } 
      
    
 public static void main(String args[]) 
 { 
  RevTree tree = new RevTree(); 
  tree.root= new Node(1); 
  tree.root.l= new Node(2); 
  tree.root.r= new Node(3); 
   tree.root.l.l= new Node(4); 
   tree.root.l.r= new Node(5); 
         
   System.out.println("lev order traversal of binary tree is "); 
    tree.treeprint(); 
} 
}