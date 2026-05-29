from unittest import TestCase
from caesar_cipher import *

class test_caesar_cipher(TestCase):
    
    def test_encrypt_standard(self):
        self.assertEqual(encrypt("Hello", 3), "Khoor")

    def test_encrypt_wrap(self):
        self.assertEqual(encrypt("XYZ", 3), "ABC")

    def test_decrypt_standard(self):
        self.assertEqual(decrypt("Khoor", 3), "Hello")

    def test_decrypt_wrap(self):
        self.assertEqual(decrypt("ABC", 3), "XYZ")
