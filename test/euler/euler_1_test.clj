(ns euler.euler-1-test
  (:require [clojure.test :refer :all]
            [euler.euler-1 :refer :all]))

(deftest test-prob1
    (is (= 233168 (euler-bo))
    (is (= 233168 (euler-aaron)))))
