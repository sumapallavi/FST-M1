def generate_fibonacci(n):
    fibonacci_sequence = [1, 1]
    while len(fibonacci_sequence) < n:
        next_number = fibonacci_sequence[-1] + fibonacci_sequence[-2]
        fibonacci_sequence.append(next_number)
    return fibonacci_sequence   

num_numbers = int(input("How many Fibonacci numbers would you like to generate? "))

fibonacci_numbers = generate_fibonacci(num_numbers)

print("The first", num_numbers, "Fibonacci numbers are:", fibonacci_numbers)