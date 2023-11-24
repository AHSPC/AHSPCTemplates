import requests

def askAI(prompt):
    response = requests.post('https://ahspc.deno.dev/ai', data=prompt)
    return response.text
