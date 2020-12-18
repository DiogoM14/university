const resultados = (nota) => {
  if(nota<0 || nota>20) {
    throw new Error("Introduza uma nota entre 0 e 20 valores!")
  }

  nota <= 0 || nota <= 7.4 && console.log("Recurso")
  nota <= 7.5 || nota <= 9.4 && console.log("Recuperação")
  nota <= 9.5 || nota <= 15 && console.log("Passou")
  nota <= 16 || nota <= 20 && console.log("Passou com boa nota")
}

try {
  resultados(20)
} catch (error) {
  console.log(error)
}
