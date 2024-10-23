fun main(args: Array<String>) {

    // Null in Kotlin

    /*
    *   Kotlin prevents to attribute null value to any variable/constant type
    *
    *   If you need to use the null value, there is 3 operators:
    *       ?   (Safe Call, can be a primitive type or null)
    *           var/val <variable/constant_name>:<primitive_type>?
    *
    *       ?:  (Elvis Operator, used when has attribution of null from one Safe Call variable/constant to a
    *           normal variable/constant; can return left-side value (if the attribution is non-null) or right-side
    *           value (if the attribution is null))
    *
    *       !!  (Null-check, acts like Elvis Operator, except when the attribution is null. When the attribution is
    *           null, it will return a exception (NullPointerException))
    *
    *
    */
}