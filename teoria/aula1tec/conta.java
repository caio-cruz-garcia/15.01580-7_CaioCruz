public class conta{
   private double saldo;
   public void sacar(double valor){
        if(saldo >= valor)
            saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public double consultaSaldo(){
        return this.saldo;
    }
    
}