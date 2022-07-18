fn factorial(number: i32) -> i32 {
    if number == 0 {
        1
    } else {
        number * factorial(number - 1)
    }
}

fn main() {
    println!("{}", factorial(4));
}
