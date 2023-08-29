package dorei;

import interfaces.IPizza;
import interfaces.IPizzaria;

public class PizzariaDoRei implements IPizzaria{

    @Override
    public IPizza fazPizza(String pedido) {
        IPizza iPizza;
        switch (pedido) {
            case "Calabresa":
                iPizza = new CalabresaDoRei();
                break;
            case "Mussarela":
                iPizza = new MussarelaDoRei();
                break;
            case "Portuguesa":
                iPizza = new PortuguesaDoRei();
                break;
            default:
                iPizza = null;
                break;
        }
        return iPizza;
    }
    
}