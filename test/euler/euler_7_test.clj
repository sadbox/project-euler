(ns euler.euler-7-test
  (:require [clojure.test :refer :all]
            [euler.euler-7 :refer :all]))

(deftest test-seve
  (is (= 3 (seven 2)))
  (is (= 104743 (seven 10001))))
