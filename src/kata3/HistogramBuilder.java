/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Tronx
 */
public class HistogramBuilder <Type>{
    
    public Histogram<Type> build(Type[] types){
        Histogram<Type> histogram = new Histogram<>();
        for (Type type : types) {
            if(histogram.containsKey(type))
                histogram.put(type, histogram.get(type)+1);
            else
                histogram.put(type, 1);
        }
        return histogram;
    }
}
