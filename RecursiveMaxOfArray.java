public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     *
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int[] data, int from, int to) throws BadArgumentsForMaxException
    {

        if ( data == null ) throw new BadArgumentsForMaxException("Array not valid");
        if ( from > to ) { throw new BadArgumentsForMaxException("From greater than to."); }
        if ( to < 0 | from < 0 ) throw new BadArgumentsForMaxException("Index must be zero or greater");
        if ( data.length <= 0 ) throw new BadArgumentsForMaxException("Array length must be greater than zero");
        if ( to >= data.length | from > data.length ) { throw new BadArgumentsForMaxException("Range must be within array"); }
        
        // ADD YOUR CODE HERE
        /* Going out of bounds somewhere
            if(data.length == 1) { return data[0]; }
            if(data.length == 2) { return Math.max(data[0], data[1]); }

            int middle = (to + from) / 2;
            int max1 = max(data, from, middle);
            int max2 = max(data, middle+1, to);

            result = Math.max(max1, max2);
            return result;
        */


        if ( from == to ) {
            return data[from];
        }

        int middle = (from + to)/2;

        int max1 = max( data, from, middle );
        int max2 = max( data, middle + 1, to );

        return Math.max( max1, max2 );
    }
    
    
}
