# api call by request module installed on venv

import requests

response = requests.get("https://api.github.com")
print("Status code:", response.status_code)
