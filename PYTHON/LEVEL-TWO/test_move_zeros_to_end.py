from unittest import TestCase
from move_zeros_to_end import *

class TestMoveZeros(TestCase):
    def test_with_given_example(self):
        self.assertEqual(move_zeros_to_end([5, 0, 3, 0, 2, 0]), [5, 3, 2, 0, 0, 0])

    def test_with_no_zeros(self):
        self.assertEqual(move_zeros_to_end([1, 2, 3]), [1, 2, 3] )

    def test_all_zeros(self):
        self.assertEqual(move_zeros_to_end([0, 0, 0]), [0, 0, 0])

