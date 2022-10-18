package com.cursoteste.left_right_app;

import java.util.ArrayList;

import com.cursoteste.left_right_app.Calculator;

/**
 * A ideia aqui eram 2 listas de digitos de [0,9], direita e esquerda.
 * 
 * O programa recebe ambas listas e soma direita com esquerda, retornando uma lista com a soma dos resultados.
 * Caso as pré-condições não fossem cobertas, retorna um IllegalArgumentException
 * 
 * Nulo retorna null
 * Vazio significa 0
 * 
 * Obs: dada duas listas:
 * 
 *  [1,2,3,4] e [2,3,4,5]
 * 
 * Poderia ser compreendido que a soma fosse feita:
 * 
 * I:[1,2,3] --> 4 + 2 <-- [3,4,5] 
 * 
 * ou
 * 
 * II :[2,3,4] --> 1 + 2 <-- [3,4,5]
 *
 * Entendo que o ennciado implementa o II.
 */
public class App 
{
    public static void main( String[] args )
    {
        
        int[] left = null;

        int right[] = {1,2,9};

        ArrayList<Integer> result = Calculator.sum(left, right);

        if(result == null){
            System.out.println("nulo");
            return;
        }   

        for(int i=0; i<result.size();i++ )
            System.out.println(result.get(i));
    }
}
