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