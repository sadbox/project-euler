(ns euler.euler-6-test
  (:require [clojure.test :refer :all]
            [euler.euler-6 :refer :all]))

(deftest test-six
  (is (= 2640 (six 11)))
  (is (= 25164150 (six 101))))
