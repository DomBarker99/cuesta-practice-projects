package plane_classes;

/**
 * CustomComparator is an interface providing a method for comparing two elements of any type.
 *
 * @param <AnyType> The type of elements to be compared.
 */
public interface CustomComparator<AnyType> {

    /**
     * Compares two elements for order. Returns a negative integer, zero, or a positive integer
     * as the first element is less than, equal to, or greater than the second.
     *
     * @param lhs The first element to be compared.
     * @param rhs The second element to be compared.
     * @return A negative integer, zero, or a positive integer as the first element is less than, equal to, or greater than the second.
     */
    int compareTo(AnyType lhs, AnyType rhs);
}
