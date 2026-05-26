def get_perfect_squares(numbers):
    result = []
    for index in numbers:
        if int(index**0.5) * int(index**0.5) == index:
            result.append(index)
    return result
