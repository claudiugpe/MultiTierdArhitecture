import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CallbackComponent } from './callback.component';
import { HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './users/users.component';
import { BoardsComponent } from './boards/boards.component';
import { WorkItemsComponent } from './work-items/work-items.component';
import { UsersService } from './users.service';
import { BoardsService } from './boards.service';
import { WorkItemService } from './work-item.service';


@NgModule({
  declarations: [
    AppComponent,
    CallbackComponent,
    UsersComponent,
    BoardsComponent,
    WorkItemsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    UsersService,
    BoardsService,
    WorkItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
