import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { PassComponent } from './pass/pass.component';
import { RegisterformComponent } from './registerform/registerform.component';
import { SearchComponent } from './search/search.component';
import { SelectflightsComponent } from './select-flight/select-flight.component';


@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,RegisterformComponent,
    LoginComponent,PassComponent,SelectflightsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule
  ],
  providers: [SearchComponent,DataTransfer],
  bootstrap: [AppComponent]
})
export class AppModule { }
