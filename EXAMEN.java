public class Main {
    public static void main(String[] args) {
                //TODO Auto-generated method stub
                ListaEnLazada lista=new ListaEnLazada();
                Scanner leer = new ListaEnLazada();
                System.out.println("ingresa el numero de la opcion que deseas realizar");
                System.out.println("1 - Insertar Cabeza");
                System.out.println("2 - Insertar Cola");
                System.out.println("3 - Borrar Lista");
                System.out.println("4 - Imprimir Lista");
                int numero = leer.nextInt();
                if(numero==1){
                    System.out.println("¿Que numero deseas ingresar?");
                    int cabeza = leer.nextInt();
                    lista.añadirInicio(cabeza);
                }
                else if(numero==2){
                    System.out.println("¿Que numero deseas ingresar?");
                    int cola = leer.nextInt();
                    lista.añadirFinal(cola);
                }
                else if(numero==3){
                    System.out.println("¿Que numero deseas borrar?");
                    int borrar = leer.nextInt();
                    lista.borrarValor(borrar);
                }
                else if(numero==4){
                    System.out.println("lista:");
                    lista.mostrar();
                }else{
                    System.out.println("No es valido, ingresa el numero de la opcion que deseas realizar");
                }

            }
        }

        class nodo{
            int valor;
            nodo siguiente;

            nodo(int valor){
                this.valor=valor;

            }
        }
        class ListaEnLazada{
            nodo cabeza;

            public void AñadirFinal(int valor){
                //Verificar si nuestra lista enlazada esta vacia
                if(vacia()==true) {
                    cabeza=new nodo (valor);
                }
                //caso contrario... iterar hasta encontrar ultimo elemento
                nodo mensajero=cabeza;
                while(mensajero.siguiente!=null) {
                    mensajero=mensajero.siguiente;
                }
                mensajero.siguiente=new nodo(valor); //para añadir al final
            }
            public void añadirInicio(int valor) {
                //Verificar si lista esta vacia
                if(vacia()){
                    cabeza=new nodo(valor);
                }
                //1. Crear nodo
                nodo nuevo=new nodo(valor);
                nuevo.siguiente=cabeza;
                cabeza=nuevo;//para que vaya al inicio
            }
            public void borrarValor(int valor){
                //Verificar si nuestra lista esta vacia
                if(vacia()){System.out.print("Lista vacia");} //si no hay nada no hagas nada

                //si cabeza es el nodo que queremos eliminar
                if(cabeza.valor==valor){
                    cabeza=cabeza.siguiente;
                }

                //iterar hasta encontrar un nodo antes del que queremos eliminar
                nodo mensajero=cabeza;
                while(mensajero.siguiente!=null) {
                    if (mensajero.siguiente.valor==valor) {
                        mensajero.siguiente=mensajero.siguiente.siguiente;
                    }
                    mensajero=mensajero.siguiente; //si es el mismo pues al siguiente;

                }
            }

            public void mostrar() {
                //verificar si la lista esta vacia
                if (vacia()){
                    System.out.print("Lista vacia");
                }
                nodo mensajero=cabeza;
                while(mensajero!=null){
                    System.out.print("\n"+mensajero.valor);
                    mensajero=mensajero.siguiente;
                }
            }
            private boolean vacia() { //para no repetir lo de arriba
                if(cabeza==null){
                    return true;
                }
                else{
                    return false;
                }
            }
        }