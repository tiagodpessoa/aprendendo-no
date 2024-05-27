package dados;

public class Pilha<T> {

    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(T object){
        No<T> novoNo = new No<>(object);
        No<T> refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No<T> pop(){
        if (!this.isEmpty()){
            No<T> noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No<T> top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "----------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------\n";

        No<T> noAuxiliar =  refNoEntradaPilha;
        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getObject() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "==========";
        return stringRetorno;
    }
}
