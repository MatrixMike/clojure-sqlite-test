(defproject database-test "0.1.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
   [org.clojure/java.jdbc "0.4.2"]
   [org.xerial/sqlite-jdbc "3.8.11"]]
  :main      ;;  ^:skip-aot
   database-test.core
;;  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
