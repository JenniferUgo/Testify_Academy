import main
import unittest

class TestMain(unittest.TestCase):
    def test_addition(self):
        self.assertEqual(main.addition(1, 2), 3, "should be 3")
        self.assertEqual(main.addition(5, 5), 10, "should be 10")
        self.assertEqual(main.addition(40, 20), 60, "should be 60")
        self.assertEqual(main.addition(-3, 2), -1, "should be -1")

    def test_subtraction(self):
        self.assertEqual(main.subtraction(8, 2), 6, "should be 6")
        self.assertEqual(main.subtraction(7, 5), 2, "should be 2")
        self.assertEqual(main.subtraction(40, 20), 20, "should be 20")
        self.assertEqual(main.subtraction(300, 20), 280, "should be 280")
        self.assertEqual(main.subtraction(4, 2), 2, "should be 2")

    def test_multiplication(self):
        self.assertEqual(main.multiplication(8, 2), 16, "should be 16")
        self.assertEqual(main.multiplication(7, 5), 35, "should be 35")
        self.assertEqual(main.multiplication(40, 20), 800, "should be 800")
        self.assertEqual(main.multiplication(30, 20), 600, "should be 600")
    

if __name__ =='__main__':
    unittest.main()
