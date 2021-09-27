import { Component, OnInit } from '@angular/core';
import { Form, FormGroup } from '@angular/forms';
import { Customer } from '../appmodel/Customer';
import { SearchObj } from '../appmodel/SearchObj';
import { DatatransferService } from '../datatransfer.service';
import { SearchComponent } from '../search/search.component';
@Component({
  selector: 'app-pass',
  templateUrl: './pass.component.html',
  styleUrls: ['./pass.component.css']
})






export class PassComponent implements OnInit {

  customer=new Customer;
  tickets=[];
  a:number;
  i:number=1;
  
  constructor(private datae:DatatransferService) { }

  ngOnInit() {

    this.datae.count.subscribe(c => {
      this.a = c;
  });

    this.customer=new Customer();
    this.tickets.push(this.customer);
  }

  
  

  
 
//   counter(i: number) {
//     return new Array(i);
// }

  //  handleClear(){
  //    alert("working")
  //    this.customer.name =null;
  //    this.customer.age=null;
  //    this.customer.gender=null;
  //    this.i++;
  //  }

  process(){
    //alert("VAlid");
    
    alert("Passanger Added");

    //this.tickets.push(this.customer);
    //console.log(this.tickets)
    console.log(this.tickets);

    //this.customer.name =null;
    //this.customer.age=null;
    //this.customer.gender=null;
    
    
    
    
    
    
  }
  // handleClear(){
  //   alert("working")
  //   this.customer.name =null;
  //   this.customer.age=null;
  //   this.customer.gender=null;
  // }



 
  addForm(){
    this.customer=new Customer();
    this.tickets.push(this.customer);
    this.i++;
  }

}