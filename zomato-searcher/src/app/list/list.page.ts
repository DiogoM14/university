import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ZomatoService } from '../zomato.service';

type ResponseProps = {
  results_found: number
  restaurants: [
    length: number
  ]
}

@Component({
  selector: 'app-list',
  templateUrl: './list.page.html',
  styleUrls: ['./list.page.scss'],
})
export class ListPage implements OnInit {

  constructor(private route: ActivatedRoute, private zomatoService: ZomatoService) { }

  results: any = null
  numberOfResults: any = null

  ngOnInit() {
    const queryParamMap = this.route.snapshot.queryParamMap;
    const cityId = Number(queryParamMap.get('entity_id'))
    const colecao = Number(queryParamMap.get('collection_id'))
    const category = Number(queryParamMap.get('category'))

    this.getRestaurantList(cityId, colecao, category);
  }

  getRestaurantList(cityId: number, colecao: number, categoria: number): void {
    this.zomatoService
      .getRestaurantList(cityId, colecao, categoria)
      .subscribe((res: ResponseProps) => {
        this.numberOfResults = res.results_found
        this.results = res.restaurants
      })
  }

}
