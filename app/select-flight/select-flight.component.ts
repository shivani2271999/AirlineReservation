import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from '../appmodel/flight';

@Component({
  selector: 'app-selectflights',
  templateUrl: './select-flight.component.html',
  styleUrls: ['./select-flight.component.css']
})
export class SelectflightsComponent {
  flights:Flight[]=[
    new Flight(1001,"Chennai","Salem",new Date( "9/3/10 12:05 AM"),new Date("9/3/10 1:05 PM" ),300),
    new Flight(1002,"Chennai","Salem",new Date( "9/3/10 02:05 AM"),new Date("9/3/10 3:05 PM" ),350),
    new Flight(1003,"Chennai","Salem",new Date( "9/3/10 03:05 AM"),new Date("9/3/10 4:05 PM" ),400)
  ];
  constructor(private router: Router) { }

  process(){

    this.router.navigate(['/passLink']);
  }

}
