public class node{
    private object data;
    private node next;

    public int getData(){
        //aqui obtenemos informacion
        return data;
    }
    public void setData(int data){
        //aqui se agregan valores, se tienen que enviar sino no se pueden agregar
        this.data= data; //aqui se igualan los datas y el nodo ya tiene asignado un valor
    }

    public node getNext(){
        return next;
    }

    public void setNext(int data, node next ){
        this.data = data;
        this.next = next; 
    }
}