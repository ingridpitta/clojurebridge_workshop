(ns cipher.core)

(def ascii-a (int \a))

(defn to-int
  "recebe uma letra minúscola e retorna sua posição no alfabeto: a = 0, b = 1, etc."
  [letter-char]
  (- (int letter-char) ascii-a)
  )

(defn to-char
  "transcforma o código ascii-a de volta em um caractere"
  [int-char]
  (char (+ ascii-a int-char))
  )


(defn shift
  [letter key]
  (to-char (mod (+ (to-int letter) key) 26))
  )

(defn caesar-encrypt
  [letter key]
  (apply str (mapv #(shift % key) letter))
  )

(defn caesar-decrypt
  [letter key]
  (apply str (mapv #(shift % (* key -1) ) letter))
  )