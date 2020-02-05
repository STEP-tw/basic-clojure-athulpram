(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 3 0)))))

(deftest harishchandra-test
  (testing "true value"
    (is (= 2 (harishchandra 2))))
  (testing "falsy value"
    (is (nil? (harishchandra false))))
  (testing "nil value"
    (is (nil? (harishchandra nil))))
  )

(deftest yudishtira-test
  (testing "true value"
    (is (= 2 (yudishtira 2))))
  (testing "falsy value"
    (is (= :ashwathama (yudishtira false))))
  (testing "falsy value"
    (is (= :ashwathama (yudishtira nil)))))

(deftest duplicate-first-test
  (testing "in a list"
    (is (= `(1 1 2) (duplicate-first '(1 2)))))
  (testing "in an vector"
    (is (= [1 1 2] (duplicate-first [1 2]))))
  (testing "empty list"
    (is (nil? (duplicate-first '()))))
  (testing "empty vector"
    (is (nil? (duplicate-first [])))))

(deftest five-point-someone-test
  (testing "y is 5"
    (is (= :chetan-bhagat (five-point-someone 3 5))))
  (testing "x is 5"
    (is (= :satan-bhagat (five-point-someone 5 3))))
  (testing "x is greater than y"
    (is (= :greece (five-point-someone 6 3))))
  (testing "y is greater than x"
    (is (= :universe (five-point-someone 4 6)))))

(deftest conditions-apply-test
  (testing "wonder woman case"
    (is (= :wonder-woman (conditions-apply [1 3]))))
  (testing "durga case"
    (is (= :durga (conditions-apply [:a :b :c :d]))))
  (testing "wonder woman case"
    (is (= :cleopatra (conditions-apply [[2 3] [4 5] [0 0]]))))
  (testing "default case"
    (is (= :tuntun (conditions-apply [])))))

(deftest repeat-and-truncate-test
  (testing "repeat and truncate"
    (is (= [0 1 2 3 0 1 2] (repeat-and-truncate (range 4) true true 7)))))

(deftest order-in-words-test
  (testing "6 > 3 > 1"
    (is (= [:x-greater-than-y :y-greater-than-z] (order-in-words 6 3 1) )))
  (testing "1 < 2 < 3"
    (is (= [:z-greater-than-x] (order-in-words 1 2 3) )))
  (testing "empty"
    (is (= [] (order-in-words 1 1 1) )))
  )
