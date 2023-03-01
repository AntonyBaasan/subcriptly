# start webapp
# start-process powershell -ArgumentList "clear; echo 'starting...'; cd ~/git/subcriptly/webapp; ng serve"
# start-process powershell -ArgumentList "clear; cd ~/git/subcriptly/backend; gradle :restapi:bootRun"

# check os is windows

if ($IsWindows) {
    # run the terminal
    wt.exe -w ngTab -d c:/users/abaasandorj/git/subcriptly/webapp powershell -c 'ng serve'
    wt.exe -w springTab -d c:/users/abaasandorj/git/subcriptly/backend powershell -c 'gradle :restapi:bootRun'
} elseif ($IsMacOS) {
    # start-process pwsh -ArgumentList "-WorkingDirectory ~/git/subcriptly/webapp -command ng serve" -PassThru
    # start-process pwsh -ArgumentList "-WorkingDirectory ~/git/subcriptly/backend -command gradle :restapi:bootrun" -PassThru
    echo "mac"
} else {
    echo "not supported OS"
}


