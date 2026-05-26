def move_zeros_to_end(numbers):
    result = []
    zeros = 0
    for index in numbers:
        if index == 0:
            zeros += 1
        else:
            result.append(index)
    result.extend([0] * zeros)
    return result
