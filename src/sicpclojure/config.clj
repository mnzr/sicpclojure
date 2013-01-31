(ns sicpclojure.config)

(def build {:path-to-code "resources/code/" ; Path to code excerpts.
            :path-to-text "resources/text/" ; Path to chapter text.
            :deploy-directory "deploy/"     
            :ignore #{".scss"}              ; Ignore these filetypes when deploying.
            :complete [9 10 11 12]          ; Vector of completed pages.
            :repo-url "https://github.com/ecmendenhall/sicpclojure/"})        

(def templates {:js    ["modernizr.js"
                        "colorscheme.js"
                        "analytics.js"]
                :css   ["style.css"]
                :fonts [["Lora" 
                          :size [400 700]
                          :style ["italic"]]
                        ["Ubuntu Mono"]]
                :font-url "http://fonts.googleapis.com/css?family="
                :static-dir "static/"})
