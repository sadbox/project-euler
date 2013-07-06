(ns euler.util-test
  (:require [clojure.test :refer :all]
            [euler.util :refer :all]
            [clojure.contrib.lazy-seqs :as lazyseqs]))

(deftest test-div
  (is (= true (div? 10 2)))
  (is (= false (div? 9 2)))
  (is (= false (div? 2 10)))
  (is (= false (div? 7 3))))

(deftest test-primes
  (is (= (take 10000 lazyseqs/primes) (take 10000 primes)))
  (is (= '(2) (take 1 primes))))

(deftest test-fib
  (is (= '(0 1 1 2 3 5) (take 6 fib-seq))))

(deftest test-powers
  (is (= '(1 2 4 8 16 32 64) (take 7 (powers-of 2))))
  (is (= (apply * (repeat 30 3)) (nth (powers-of 3) 30))))
