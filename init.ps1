
param (
    [string]
    $secrets_file = '.\subcriptly-secrets.json'
)

if (-not(Test-Path $secrets_file)) {
    Write-Error "The secrets file is missing!"
    exit
}

$secrets = Get-Content $secrets_file -Raw | ConvertFrom-Json
#test if secrets file read correctly
Write-Output $secrets.name

#TODO: Setup ansible
#TODO: Validate Azure credentials
