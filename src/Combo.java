class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo() {
    }

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burguer = new Burguer("Cheeseburger", 15.0, 200);
                sobremesa = new Sobremesa("Sorvete", 7.0, "Médio");
                bebida = new Bebida("Coca-Cola", 5.0, 350);
                break;
            case 2:
                burguer = new Burguer("X-Bacon", 20.0, 250);
                sobremesa = new Sobremesa("Brownie", 10.0, "Grande");
                bebida = new Bebida("Suco de Laranja", 8.0, 400);
                break;
            default:
                System.out.println("Opção inválida. Criando Combo Padrão.");
                burguer = new Burguer("Hamburger", 12.0, 150);
                sobremesa = new Sobremesa("Pudim", 5.0, "Pequeno");
                bebida = new Bebida("Água", 3.0, 500);
                break;
        }
    }

    @Override
    public String toString() {
        return "Itens do Combo:\n" +
                "Sanduíche: " + burguer + "\n" +
                "Sobremesa: " + sobremesa + "\n" +
                "Bebida: " + bebida + "\n" +
                "Preço total do Combo: R$" + calcularPrecoCombo();
    }

    public double calcularPrecoCombo() {
        return burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco();
    }
}