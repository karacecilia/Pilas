public class Pilas{
    private nodo top;
    
    public Pilas (){
        top = null;
    }
    
    public boolean vacia () {
        return (top == null);
    }
   
    public void push(int valor){//INSERTAR
        nodo nevoNodo;
        if (vacia ())
            top = new nodo (valor);
        else{
            nodo nuevoNodo = new nodo (valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }
    
    public void cima (){//buscar
        if(!vacia()){
            System.out.println("Cima: "+top.getValor());
        }else{
           System.out.println("La pila esta vacía");
        }
    }
    
    public void peek() {//mostrar
        nodo temp =top;
        if( temp!=null){
            System.out.println(temp.getValor());
            temp=temp.getProx();
        }
        else
           System.out.println("PILA VACÍA");
        }
        
    public void pop(){//extraer
        if( !vacia()){
                System.out.println("Dato extraido: "+top.getValor ());
                top = top.getProx();
            }
            else
               System.out.println("La pila esta vacía");
       }
       
    
            
            
}
