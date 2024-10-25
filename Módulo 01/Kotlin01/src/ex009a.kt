fun main(args: Array<String>) {
    println("""
       MAIN MENU
        [1] New
        [2] Edit
        [3] ...
        [4] ...
    """)
    print("\n")

    val currentYear = 2024
    val birthYear = 1978

    println("You are born in $birthYear and today we are in the year $currentYear.")
    println("You are ${currentYear - birthYear} years old.")

    println("\n")
    print("""
       Hi! How are you?
       You are born in $birthYear and today we are in the year $currentYear.
       So, you are ${currentYear - birthYear} years old.
    """)
}