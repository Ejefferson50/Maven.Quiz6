package rocks.zipcode.io.collections;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        TypeOfSet[] element = (TypeOfSet[]) this.originalSet.toArray();

        final int len = 1 << element.length;

        Set<Set<TypeOfSet>> powerSet = new HashSet<>();
        for( int i = 0; i < len; i++ ) {
            Set<TypeOfSet> subset = new HashSet<>();
            for( int j = 0; j < element.length; j++ ) {
                int internal = 1 << j;
                if( (i & internal) != 0 ) {
                    subset.add( element[j] );
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
