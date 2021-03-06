(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))))

(deftest filter-test
  (testing "filter even"
    (is (= [2 4] (filter' even? [1 2 3 4]))))
  (testing "filter odd"
    (is (= [1 3] (filter' odd? [1 2 3 4])))))

(deftest reduce-test
  (testing "sum"
    (is (= 10 (reduce' + [1 2 3 4])))))

(deftest count-test
  (testing "number of element in a list"
    (is (= 4 (count' [1 2 3 4])))))

(deftest reverse-test
  (testing "reverse"
    (is (= [4 3 2 1] (reverse' [1 2 3 4])))))

(deftest every-test
  (testing "true condition"
    (is (true? (every?' odd? [1 3]))))
  (testing "false condition"
    (is (false? (every?' odd? [1 2])))))

(deftest ascending-test
  (testing "ascending"
    (is (true? (ascending? [1 2 3]))))
  (testing "non-ascending"
    (is (false? (ascending? [1 2 3 1])))))

(deftest distinct-test
  (testing "distinct numbers"
    (is (= [1 3 2] (distinct' [1 2 3 1 2])))))

(deftest sum-of-adjacent-digits-test
  (testing "sum of adjacent numbers"
    (is (= [3 5] (sum-of-adjacent-digits [1 2 3])))))

(deftest max-three-digit-sequence-test
  (testing "max 3 digit sequence"
    (is (= [2 -1 2] (max-three-digit-sequence [1 2 -1 2 0])))))

(deftest transpose-test
  (testing "row column transformation"
    (is (= [[1 1] [2 2] [3 3]] (transpose [[1 2 3] [1 2 3]])))))

(deftest difference-test
  (testing "difference of two vectors"
    (is (= '(3) (difference [1 2] [1 2 3])))))

(deftest third-or-fifth-test
  (testing "third-or-fifth"
    (is (= [1 4 2 7] (third-or-fifth [1 2 8 4 15 2 7])))))

(deftest sqr-of-the-first-test
  (testing "squaring first number in list"
    (is (= [16 16 16] (sqr-of-the-first [4 6 7])))))

(deftest muted-thirds-test
  (testing "muted-thirds"
    (is (= [1 2 0 4 15 0 7] (muted-thirds [1 2 8 4 15 2 7])))))

(deftest palindrome
  (testing "empty list"
    (is (true? (palindrome? []))))
  (testing "palindrome list"
    (is (true? (palindrome? [1 2 3 2 1]))))
  (testing "non palindrome list"
    (is (false? (palindrome? [1 2 3 1])))))

(deftest index-of-test
  (testing "when element present in the list"
    (is (= 1 (index-of [1 2 3] 2))))
  (testing "when element is not present"
    (is (= -1 (index-of [1 2 3 1] 4)))))

(deftest double-up-test
  (testing "numbers to double up"
    (is (= [1 1 2 2 3 3] (double-up [1 2 3])))))