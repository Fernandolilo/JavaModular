package com.systempro.util.operacao;

import com.systempro.util.operacao.internal.DivHelper;
import com.systempro.util.operacao.internal.MultHelper;
import com.systempro.util.operacao.internal.SubHelper;
import com.systempro.util.operacao.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora() {
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return subHelper.execute(a, b);
    }
}
