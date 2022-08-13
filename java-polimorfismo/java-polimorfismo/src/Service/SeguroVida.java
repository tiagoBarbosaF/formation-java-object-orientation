package Service;

import Interfaces.Tributavel;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 30;
    }
}
