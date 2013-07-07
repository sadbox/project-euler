(ns euler.euler-8-test
  (:require [clojure.test :refer :all]
            [euler.euler-8 :refer :all]))

(deftest test-splitnum
  (is (= '("123" "232" "323" "234") (splitnum "123234" 3)))
  (is (= '("1" "2" "3") (splitnum "123" 1))))
