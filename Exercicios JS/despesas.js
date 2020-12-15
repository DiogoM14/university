const account = {
  incomes: [900, 120.12],
  expenses: [450, 180.3]
}

const sum = (array) => {
  let total = 0;

  for (let value of array) {
    total+=value
  }
  
  return total
}

const getBalance = () => {
  const incomes = sum(account.incomes)
  const expenses = sum(account.expenses)

  const balance = incomes - expenses

  balance<0 && console.log(`Cuidado, está com um prejuízo de ${balance.toFixed(2)}`) 

  balance>=0 && console.log(`O seu saldo é de ${balance.toFixed(2)}$`)
}

getBalance()
