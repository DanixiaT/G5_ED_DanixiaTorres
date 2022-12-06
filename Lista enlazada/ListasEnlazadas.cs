public class ListasEnlazas {
    private node head;
    private node tail;
    private  tring name;
    //los elementosd e la lista

    public cerateList (string listname){
        name =listName;
        head= tail=null; // el name es igual al valor de entrada que se esta dando
    }
    public bool isListEmpty(){
        if(head==null){
            return true
        }
        return false; 
        //sea valida que si la cabeza de la lista es nula es true, sino quiere decir que sigue un head y se manda un false
    }
    public void insertNode(int item){
        //es void por que no se regresa un valor
        if(isListEmpty){
            head.createNode(data);
            
            tail=head;
        }
    }
}