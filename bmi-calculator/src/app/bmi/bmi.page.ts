import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BMI } from '../models/bmi.model';
import { BMIService } from './bmi.service';

@Component({
  selector: 'app-bmi',
  templateUrl: './bmi.page.html',
  styleUrls: ['./bmi.page.scss'],
})
export class BMIPage implements OnInit {
  altura: number;
  peso: number;
  bmi: BMI;

  constructor(private bmiService: BMIService, private router: Router) { }

  calculaBMI() {
    this.bmi = this.bmiService.calculaBMI(this.altura, this.peso);
  }

  verMais() {
    this.router.navigate(['details'])
  }

  ngOnInit() { }
}
