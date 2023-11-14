import requests

url = "http://64.225.89.231:11434/api/generate"

def ask_ai(prompt: str) -> str:
    data = {
        "model": "mistral",
        "prompt": prompt,
        "stream": False
    }

    response = requests.post(url, json=data)

    return response.json()["response"]
