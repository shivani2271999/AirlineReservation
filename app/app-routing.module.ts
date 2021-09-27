import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PassComponent } from './pass/pass.component';
import { RegisterformComponent } from './registerform/registerform.component';
import { SearchComponent } from './search/search.component';
import { SelectflightsComponent } from './select-flight/select-flight.component';


const routes: Routes = [

  {path:'',
    component:SearchComponent
},
{path:'searchLink',
component:SearchComponent},

{path:'registerLink',
component:RegisterformComponent}
,{

  path:'loginLink',
  component:LoginComponent
},
{
  path:'selectLink',
  component:SelectflightsComponent

},

{
   path:'passLink',
   component:PassComponent

}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
