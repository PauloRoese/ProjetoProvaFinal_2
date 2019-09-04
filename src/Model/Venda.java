
package Model;


public class Venda extends Item{
    
    
    private int idVenda;
    private int quantidadeVenda;
    private double valorDeVenda;

    
    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the valorDeVenda
     */
    public double getValorDeVenda() {
        return valorDeVenda;
    }

    /**
     * @param valorDeVenda the valorDeVenda to set
     */
    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    /**
     * @return the quantidadeVenda
     */
    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    /**
     * @param quantidadeVenda the quantidadeVenda to set
     */
    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }
     
}
