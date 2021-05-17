import { Component, OnInit } from '@angular/core';
import { ZomatoService } from '../zomato.service';

const CITIES = {
  311: {
    id: 311,
    name: 'Porto',
    coords: {
      lat: 41.14961,
      lon: -8.61099,
    },
  },
  82: {
    id: 82,
    name: 'Lisboa',
    coords: {
      lat: 38.7223,
      lon: -9.1393,
    },
  },
  11610: {
    id: 11610,
    name: 'Faro',
    coords: {
      lat: 37.0194,
      lon: -7.9304,
    },
  },
};

@Component({
  selector: 'app-search',
  templateUrl: './search.page.html',
  styleUrls: ['./search.page.scss'],
})
export class SearchPage implements OnInit {
  selectedCity: number = 311
  selectedCategoria: string
  selectedColecao: string

  categoriasList = []
  colecoesList = []

  constructor(private zomatoService: ZomatoService) { }

  ngOnInit() {
    this.selectedCity = 311
    this.getCategories()
    this.getColecoes()
  }

  getCategories() {
    this.zomatoService.getCategories().subscribe((response) => {
      this.categoriasList = response.categories
    })
  }

  getColecoes() {
    const cidade = CITIES[this.selectedCity]
    this.zomatoService
      .getCollections(cidade.coords.lat, cidade.coords.lon)
      .subscribe((response) => {
        this.colecoesList = response.collections;
      })
  }

  onChangeCity() {
    this.getColecoes()
  }
}
