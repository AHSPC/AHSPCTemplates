const apiUrl = "http://64.225.89.231:11434/api/generate";

async function askAI(prompt) {
    const data = {
        model: "mistral",
        prompt: prompt,
        stream: false
    };

    try {
        const response = await fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
        });

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const responseData = await response.json();
        return responseData.response;
    } catch (error) {
        console.error("Error:", error.message);
        return null;
    }
}