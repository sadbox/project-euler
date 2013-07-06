(ns euler.euler-2-test
  (:require [clojure.test :refer :all]
            [euler.euler-2 :refer :all]))

(deftest test-euler
    (is (= 4613732 (euler 4000000)))
    (is (= 60696 (euler 60000)))
    (is (= 44 (euler 50)))
    (is (= 10 (euler 10))))
