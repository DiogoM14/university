import { Injectable } from '@angular/core';
import { BMI } from '../models/bmi.model';

@Injectable({
  providedIn: 'root'
})
export class BMIService {

  constructor() { }

  calculaBMI(altura: number, peso: number) {
    const BMI = peso/altura/altura

    return <BMI> {
      BMI,
      classificacao : this.classificaBMI(BMI)
    }
   }

   private classificaBMI(BMI: number) {
     if (BMI < 18.5) {
       return 'Magreza'
     } else if (BMI > 18.5 && BMI < 24.9) {
       return 'Peso normal'
     } else if (BMI > 25 && BMI < 29.9) {
       return 'Sobrepeso'
     } else if (BMI > 30 && BMI < 34.9) {
       return 'Obesidade 2'
     } else if (BMI > 40) {
       return 'Obesidade 3'
     }
   }
}
