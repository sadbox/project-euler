(ns euler.euler-4-test
  (:require [clojure.test :refer :all]
            [euler.euler-4 :refer :all]))

(deftest test-palindrome
  (is (is-palindrome 90009))
  (not (is-palindrome 9099))
  (is (is-palindrome 12321)))

(deftest test-euler
  (is (= 906609 (euler 99 1000)))
  (is (= 9009 (euler 9 100))))
