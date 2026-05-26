def is_palindromic(numbers):
    left, right = 0, len(numbers) - 1

    while left < right:
        if numbers[left] != numbers[right]:
            return False
        left += 1
        right -= 1

    return True
