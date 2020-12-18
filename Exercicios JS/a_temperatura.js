const degrees = (temperature) => {
  const stringToArray = temperature.split("°")
  const unity = stringToArray.includes("F")

  const temperatureArray = stringToArray[0]

  if(unity == false) {
    const f = temperatureArray*9/5+32
    console.log(`${temperature} equivale a ${f.toFixed(1)}°F`)
  }

  if(unity) {
    const c = (temperatureArray-32)*5/9
    console.log(`${temperature} equivale a ${c.toFixed(1)}°C`)
  }
}


degrees("77.7°F")