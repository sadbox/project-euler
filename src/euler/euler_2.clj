(ns euler.euler-2
  (:require [euler.util :as util]))

(defn euler [maxnum]
  (apply +
    (take-while #(< % maxnum)
      (filter #(zero? (mod % 2)) util/fib-seq))))
