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