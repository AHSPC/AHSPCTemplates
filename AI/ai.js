async function askAI(prompt) {
  return await (await fetch('https://ahspc.deno.dev/ai', { method: 'POST', body: prompt })).text()
}
