fun main(args: Array<String>) {
    println("""
       MAIN MENU
        [1] New
        [2] Edit
        [3] ...
        [4] ...
    """)
    print("\n")

    val current_year = 2024
    val birth_year = 1978

    println("You are born in ${birth_year} and today we are in the year ${current_year} .")
    println("You are ${current_year - birth_year} years old.")

    println("\n")
    print("""
       Hi! How are you?
       You are born in ${birth_year} and today we are in the year ${current_year}.
       So, you are ${current_year - birth_year} years old.
    """)
}