def factorial(number)
    return number == 0 ? 1 : number * factorial(number - 1)
end

puts factorial(4)