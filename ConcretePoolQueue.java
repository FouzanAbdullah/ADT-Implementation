package everybodyintothepool;
import java.util.ArrayList;
import java.util.List;

public class ConcretePoolQueue<E> implements PoolQueue<E>  {
  
  /*
   * Fouzan Abdullah
   * 6840797            */
  
 public  ArrayList<ArrayList<E>> MainQueue = new ArrayList<ArrayList<E>>();
 
 @SafeVarargs
 //Method is called by all of the addSingle, addPair, etc methods
 public void add(E... item)
 {
   ArrayList<E> newlist = new ArrayList<E>();
   for(E current : item){
     newlist.add(current);
   }
   MainQueue.add(newlist);
 }
 
 //Method to add a single item to list
 public void addSingle(E item)
 {   
   add(item);
 }
 
 //Method to add a pair of items
 public void addPair(E first, E second)
 { 
   add(first,second);
 }
 
 //Method to add three items to list
 public void addTriple(E first, E second, E third)
 { 
   add(first,second,third);
 }
 
 //Method that adds four items to list
 public void addQuartet(E first, E second, E third, E fourth)
 { 
   add(first,second,third,fourth);
 }
 //if queue empty return null, 
 //Method that removes a single item to list
 public E removeSingle()
 {
   Boolean removed = false;

   for (int i = 0; i < MainQueue.size(); i++)
   {
    List<E> names = MainQueue.get(i);
    removed = false;
    if(names.size() == 1)
    {
     MainQueue.remove(i);
     removed = true;
     break;
    } 
   }
   if(!removed){
     throw new InsufficientElementsException();
   }
   return null;
 }
 
 //Method that removes a pair of items
 public List<E> removePair()
 { 
   Boolean removed = false;
   
   for (int i = 0; i < MainQueue.size(); i++) 
   {
    ArrayList<E> names = MainQueue.get(i);
    int total = 0;
    removed = false;
    if(names.size() < 2)
    {
     total += 1;
     MainQueue.remove(i);
     removed = true;  
    }
    if(total == 2)
    {
     removed = true;
     break;
    }
   }
   if(!removed)
   {
     throw new InsufficientElementsException();
   }
   return null;
 }
 
 //Method that removes three items
 public List<E> removeTriple()
 {
   Boolean removed = false;
  
   for (int i = 0; i < MainQueue.size(); i++) 
   {
    List<E> names = MainQueue.get(i);
    int total = 0;
    removed = false;
    if(names.size() < 3)
    {
      total += 1;
      MainQueue.remove(i);
      removed = true;     
    }
    if(total == 3)
    {
     removed = true;
     break;
    } 
   }
   if(!removed)
   {
     throw new InsufficientElementsException();
   }
   return null;
 }
 
 //Method that removes four items
 public List<E> removeQuartet()
 {
   Boolean removed = false;
   
   for (int i = 0; i < MainQueue.size(); i++) 
   {
    List<E> names = MainQueue.get(i);
    int total = 0;
     removed = false;
    if(names.size() < 4)
    {
      total += 1;
      MainQueue.remove(i);
      removed = true;
    }
    if(total == 4)
    {
      removed = true;
      break;
    }
   }
   if(!removed)
   {
     throw new InsufficientElementsException();
   }
   return null;
 }
 
 //Method that checks if list contains a single item
 public boolean hasSingle()
 {
   for (int i = 0; i < MainQueue.size(); i++)
   {
    List<E> current = MainQueue.get(i);
    if(current.size() == 1)
    {
     return true;
    }
   }
   return false;
 }
 
 //Method that checks if list has a pair of items
 public boolean hasPair()
 {
   for (int i = 0; i < MainQueue.size(); i++)
   {
    List<E> current = MainQueue.get(i);
    if(current.size() == 2)
    {
     return true;
    }
   }
   return false;
 }
 
 //Method that checks if list has three items
 public boolean hasTriple()
 {
   for (int i = 0; i < MainQueue.size(); i++)
   {
    List<E> current = MainQueue.get(i);
    Boolean removed = false;
    if(current.size() == 3){
      return true;
    }
   }
   return false;
 }
 
 //Method that checks if list contains four items
 public boolean hasQuartet()
 {
   for (int i = 0; i < MainQueue.size(); i++) 
   {
    List<E> current = MainQueue.get(i);
    if(current.size() == 4){
      return true;
    }
   }
   return false;
 }
 
 //Method counts size of list
 public int count()
 {
   return MainQueue.size();
 } 
}
