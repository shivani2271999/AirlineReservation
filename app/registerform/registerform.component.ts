import { Component, OnInit } from '@angular/core';
import { User } from '../appmodel/user';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent  {
  user:User=new User();
  cpassword:string;
  submit(){
    console.log(this.user);
    alert(JSON.stringify(this.user));
  }
  constructor() { }
  // function validatepassword(){
  //   var pass=document.getElementById(pass);
  //   var cpass=document.getElementById(cpass);
  //   if(pass.localeCompare(cpass)!=0){
  //       document.getElementById('passpop').innerHTML
  //       ="<font color='red'><b>Password Mismatch</b></font>";
  //       document.getElementById(pass).focus();
  //   }
  validatepassword():boolean{
    document.getElementById('passpop').innerHTML
         =""
    if(this.cpassword.localeCompare(this.user.password)!=0){
      document.getElementById('passpop').innerHTML
         ="<font color='red'><b>Password Mismatch</b></font>";
        return false;
    }
    return true;
  }
}  
