public class piloto {
    private String _PilotoName;
    private String _PilotoCpf;
    public piloto(String nome,String cpf ){
        _PilotoName = nome;
        _PilotoCpf = cpf;
    }
    public String getnome(){
        return _PilotoName;
    }
    public String getcpf(){
        return _PilotoCpf;
    }
    @Override
    public String toString(){
        return "[Nome: "+ _PilotoName + ", CPF: "+ _PilotoCpf +"]";
    }
    public void add(piloto piloto) {
    }
}
