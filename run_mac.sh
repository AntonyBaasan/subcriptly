osascript <<EOF
tell application "iTerm"
  set newWindow to (create window with default profile)
  tell current session of newWindow
    set name to "Auth API"
    write text "cd ~/git/subcriptly/webapp; ng serve"
  end tell
  tell newWindow
    set newTab to (create tab with default profile)
    tell current session of newTab
        set name to "Dashboard"
        write text "cd ~/git/subcriptly/backend; gradle :restapi:bootrun"
    end tell
  end tell
end tell
EOF
