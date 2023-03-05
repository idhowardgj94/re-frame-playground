(ns howard.reframe-playground.core
    (:require
     [reagent.core :as reagent]
     [reagent.dom :as rdom]
     [re-frame.core :as re-frame]
     [howard.reframe-playground.events :as events]
     [howard.reframe-playground.views :as views]
     [howard.reframe-playground.config :as config]
     ))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (rdom/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn init []
  (js/console.log "inside init")
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
