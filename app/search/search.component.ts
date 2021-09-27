import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SearchObj } from '../appmodel/SearchObj';
import { DatatransferService } from '../datatransfer.service';
import { PassComponent } from '../pass/pass.component';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private router: Router,private data:DatatransferService ) { }

  ngOnInit(): void {
  }
    pass:number; 
 search:SearchObj=new SearchObj();


 processs() {

  this.data.count.subscribe(c => {
    this.pass = c;

   
});

 this.pass=this.search.passenger
this.data.addCount(this.pass);
  this.router.navigate(['/selectLink']);
 
}

  



}




