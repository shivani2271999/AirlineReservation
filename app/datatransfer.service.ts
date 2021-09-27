import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DatatransferService {



  counter = 0;
    count: BehaviorSubject<number>;
  constructor() { 

    this.count = new BehaviorSubject(this.counter);

  }
  addCount(pass){
    this.count.next(pass);
  }


}
