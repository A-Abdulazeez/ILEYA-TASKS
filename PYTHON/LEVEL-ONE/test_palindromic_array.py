from unittest import TestCase
from palindromic_array import *



class TestIsPalindromic(TestCase):
    def test_palindromic_array(self):
        self.assertTrue(is_palindromic([45, 0, 8, 0, 45]))

    def test_non_palindromic_array(self):
        self.assertFalse(is_palindromic([1, 2, 3, 4]))
