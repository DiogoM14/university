const sleepCheck = (numHours) => {
  if (numHours>=8) {
    console.log("Dormiu o suficiente! Talvez até demais!") 
  } else {
    console.log("Devia descansar mais!")
  }
}

sleepCheck(5)