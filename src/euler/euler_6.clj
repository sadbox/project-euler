(ns euler.euler-6)

(defn six
  [rangenum]
  (- 
    ((fn [x] (* x x)) 
      (apply + (range 101))) 
    (apply + 
      (map 
        #(* % %) 
        (range 101)))))
