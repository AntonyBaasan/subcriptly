
$secrets = Get-Content .\subcriptly-secrets.json -Raw | ConvertFrom-Json

Write-Output $secrets.name