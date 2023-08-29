package doro;

import interfaces.IPizza;
import interfaces.IPizzaria;

public class PizzariaDoro implements IPizzaria{

    @Override
    public IPizza fazPizza(String pedido) {
        IPizza pizza;
        switch (pedido) {
            case "Calabresa":
                pizza = new CalabresaDoro();
                break;
            case "Mussarela":
                pizza = new MussarelaDoro();
                break;
            case "Portuguesa":
                pizza = new PortuguesaDoro();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
    
}