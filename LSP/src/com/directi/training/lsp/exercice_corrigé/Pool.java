package com.directi.training.lsp.exercice_corrigé;

import com.directi.training.lsp.exercice_corrigé.IDuck.IDuckException;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electronicDuck = new ElectronicDuck();
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.quack();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
                duck.swim();
            } catch (IDuckException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
