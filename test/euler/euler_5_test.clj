(ns euler.euler-5-test
  (:require [clojure.test :refer :all]
            [euler.euler-5 :refer :all]))

(deftest test-result-of-primes
  (is (= 9699690 (result-of-primes 20)))
  (is (= 30 (result-of-primes 6)))
  (is (= 1 (result-of-primes 1)))
  (is (= 614889782588491410 (result-of-primes 50))))

(deftest test-five
  (is (= 2520 (five 10)))
  (is (= 232792560 (five 20))))
