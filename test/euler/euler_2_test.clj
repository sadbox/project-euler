(ns euler.euler-2-test
  (:require [clojure.test :refer :all]
            [euler.euler-2 :refer :all]))

(deftest test-fibseq
    (is (= '(0 1 1 2 3 5 8 13 21 34) (take 10 (fib-seq))))
    (is (= '(0) (take 1 (fib-seq))))
    (is (= '() (take -1 (fib-seq)))))

(deftest test-euler
    (is (= 4613732 (euler 4000000)))
    (is (= 60696 (euler 60000)))
    (is (= 44 (euler 50)))
    (is (= 10 (euler 10))))
