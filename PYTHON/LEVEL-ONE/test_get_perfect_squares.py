from unittest import TestCase
from get_perfect_squares import *


class TestGetPerfectSquares(TestCase):

    def test_with_mixed_numbers(self):
        numbers = [1, 2, 4, 5, 9, 10, 16]
        expected = [1, 4, 9, 16]
        self.assertEqual(get_perfect_squares(numbers), expected)

    def test_with_no_perfect_squares(self):
        numbers = [2, 3, 5, 6, 7]
        expected = []
        self.assertEqual(get_perfect_squares(numbers), expected)

    def test_with_all_perfect_squares(self):
        numbers = [1, 4, 9, 16, 25]
        expected = [1, 4, 9, 16, 25]
        self.assertEqual(get_perfect_squares(numbers), expected)

    def test_with_empty_list(self):
        numbers = []
        expected = []
        self.assertEqual(get_perfect_squares(numbers), expected)

    def test_with_zero(self):
        numbers = [0, 1, 2, 3, 4]
        expected = [0, 1, 4]
        self.assertEqual(get_perfect_squares(numbers), expected)

