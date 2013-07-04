(ns euler.euler_1
  (:gen-class))

; My solution to the first Project Euler problem
(defn euler-bo []
  (reduce 
    (fn [a b]
      (+ a (cond (zero? (mod b 3)) b
                 (zero? (mod b 5)) b
                  :else 0)))
    (range 1000)))

; Aaron's Solution
(defn euler-aaron []
  (apply + 
    (filter 
      #(or (zero? (mod % 3)) 
           (zero? (mod % 5))) 
      (range 1000))))


;(println (euler-bo) (euler-aaron))
