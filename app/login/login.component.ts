import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../appmodel/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User=new User();
  constructor(private router:Router) { }

  ngOnInit(): void {

  }
  checkLogin()
  {
    console.log(this.user.emailId+" "+this.user.password);
    if(this.user.emailId=="nikhila@gmail.com" && this.user.password=="nikki123")
    {
      
      this.router.navigate(['/searchLink']);
      
      sessionStorage.setItem("email",this.user.emailId);
    }
    
  }

}
