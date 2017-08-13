;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Applications ;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns hello-seesaw.core
  (:gen-class)
  (:require [seesaw.core :as seesaw]))

(def window (seesaw/frame
             :title "First Example"
             :content "Hello World"
             :width 200
             :height 50))

;;(defn -main [& args]
;;  (seesaw/show! window)
;;  ;;(seesaw/config! window :content "Goodbye")
;;  (seesaw/alert "!Hello World!"))

;; (defn -main [& args]
;;   (defn display [content]
;;     (let [window (seesaw/frame :title "Example")]
;;       (-> window
;;           (seesaw/config! :content content)
;;           (seesaw/pack!)
;;           (seesaw/show!))))
;;   (def button
;;     (seesaw/button
;;      :text "Click Me"
;;      :listen [:action (fn [event] (seesaw/alert "Click!"))]))
;;   (display button))

;; (defn -main [& args]
;;   (defn display
;;     [content]
;;     (let [window (seesaw/frame :title "Example")]
;;       (-> window
;;           (seesaw/config! :content content)
;;           (seesaw/pack!)
;;           (seesaw/show!))))
;;   (def label (seesaw/label
;;               :text "This  is a label too"
;;               :background :white
;;               :foreground :black
;;               :font "ARIAL-BOLD-10"))
;;   (display label))

(defn -main [& args]
  (defn display
    [content]
    (let [window (seesaw/frame :title "Example")]
      (-> window
          (seesaw/config! :content content)
          (seesaw/pack!)
          (seesaw/show!))))
  (def textfield
    (seesaw/text
     :text "This is a text field"
     :editable? true
     :columns 50))
  (display textfield))
