from unittest import TestCase
from merged_array_of import *


class TestMergedArray(TestCase):

    def test_the_array_will_merge(self):
        result = merged_array_of([1, 3, 5], [2, 4, 6])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6])

    def test_if_first_array_is_empty(self):
        result = merged_array_of([], [1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_if_second_array_is_empty(self):
        result = merged_array_of([1, 2, 3], [])
        self.assertEqual(result, [1, 2, 3])

    def test_if_both_array_is_empty(self):
        result = merged_array_of([], [])
        self.assertEqual(result, [])
