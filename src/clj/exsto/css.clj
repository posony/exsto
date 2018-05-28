(ns exsto.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:.level2   {:color "#0074d9"}]
  [:.dropzone {:height "250px"
               :width "250px"
               :margin-bottom "1em"
               :text-align "center"
               :border-width "2px"
               :border-style "dashed"
               :border-color "#0074d9"}])
