(ns euler.euler-6)

(defn six
  [rangenum]
  (- 
    ((fn [x] (* x x)) 
      (apply + (range rangenum))) 
    (apply + 
      (map 
        #(* % %) 
        (range rangenum)))))
