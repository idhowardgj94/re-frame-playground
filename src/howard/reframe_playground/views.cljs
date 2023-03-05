(ns howard.reframe-playground.views
    (:require
     [reagent-mui.material.container :refer [container]]
     [re-frame.core :as re-frame]
     [howard.reframe-playground.subs :as subs]
     [howard.reframe-playground.events :as events]
     ))

;;(defn main-panel []
;;  (let [name (re-frame/subscribe [::subs/name])
;;        author (re-frame/subscribe [::subs/author])]
;;    [:div
;;     [:h1 "Hello from Howard!! " @name]
;;     [:h2 "Hello, " @author]
;;     [:button {:on-click (fn []
;;                           (js/console.log "hello")
;;                           (re-frame/dispatch [::events/click-button]))}"click to change"]
;;     [:button {:on-click (fn []
;;                           (js/console.log "666")
;;                           (re-frame/dispatch [::events/click-button-2]))} "click to change use fx event"]
;;     [:button {:on-click (fn []
;;                           (js/console.log "777")
;;                           (re-frame/dispatch [::events/click-button-3 "trytrysee"]))} "change context"]
;;     ]))


(defn main-panel
  []
  [container {:max-width "sm"}
   [:h1 "hello, world"]])
