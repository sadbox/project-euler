(ns euler.euler-1)

; My solution to the first Project Euler problem
(defn euler-bo []
  (reduce 
    (fn [a b]
      (+ a (cond (zero? (mod b 3)) b
                 (zero? (mod b 5)) b
                  :else 0)))
    (range 1000)))
