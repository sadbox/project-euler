(ns euler.util)

(defn div?
  [a b]
  (zero? (mod a b)))

(def primes
  (filter 
    (fn [y] 
      (not-any? 
        #(div? y %) 
        (range 2 (+ 1 (int (Math/sqrt y))))))
    (drop 2 (range))))

(def fib-seq  
  (( fn rfib [a b] 
    (lazy-seq (cons a (rfib b (+ a b))))) 
  0 1)) 

(defn powers-of
  [number]
  (( fn powa [a]
    (lazy-seq (cons a (powa (*' a number)))))
  1))
