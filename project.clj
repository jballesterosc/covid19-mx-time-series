(defproject covid19-mx-time-series "0.1.0-SNAPSHOT"
  :description "Project used to generate time-series data for the covid19 epidemic in Mexico"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[cider/cider-nrepl "0.24.0"]]
  :middleware [cider-nrepl.plugin/middleware]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.reader "1.3.2"]
                 [org.clojure/data.json "1.0.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [clj-http "3.10.0"]
                 [nrepl "0.7.0-beta1"]
                 [clj-time "0.15.2"]
                 [clj-jgit "1.0.0-beta3"]
                 [iota "1.1.3"]]

  :jvm-opts ["-Xms2g"]
  :main ^:skip-aot covid19-mx-time-series.core
  :target-path "target/%s"
  :repl-options {
                 ;; If nREPL takes too long to load it may timeout,
                 ;; increase this to wait longer before timing out.
                 ;; Defaults to 30000 (30 seconds)
                 :timeout 120000
                 }
  :profiles {:uberjar {:aot :all}})
