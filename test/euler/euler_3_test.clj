(ns euler.euler-3-test
  (:require [clojure.test :refer :all]
            [euler.euler-3 :refer :all]))

(deftest test-primes-until
  (is (= '(2 3 5 7) (primes-until 8))))
