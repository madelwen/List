public interface Stack { 
    public void push(Object o); 
    public Object pop();
    public Object peek();
    public int size();
    
    public boolean isBuiltOnLinkedList();
    public boolean isBuiltOnArrays();

    public boolean isEmpty();
}
