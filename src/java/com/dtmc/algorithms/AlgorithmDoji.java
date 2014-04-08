

package com.dtmc.algorithms;

import com.dtmc.Value;
import com.dtmc.algorithms.doji.Pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public final class AlgorithmDoji implements IAlgorithm {

    private Iterable _patterns;
    private final String _target;
    private final int _startPosition;

    public AlgorithmDoji(Iterable patterns, String target, int startPosition) {
        _patterns = patterns;
        _target = target;
        _startPosition = startPosition;
    }

    public void execute(List data, int index) {
        Value current = (Value) data.get(index);
        Collection result = new ArrayList();
        if (index >= _startPosition) {
            Iterator i$ = _patterns.iterator();
            do {
                if (!i$.hasNext())
                    break;
                Pattern pattern = (Pattern) i$.next();
                if (pattern.eval(data, index))
                    result.add(pattern);
            } while (true);
        }
        current.set(_target, result);
    }


}
