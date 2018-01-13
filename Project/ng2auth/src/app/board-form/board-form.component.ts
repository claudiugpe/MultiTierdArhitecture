import { Component, OnInit } from '@angular/core';
import {Board} from '../board.model';
import {BoardsService} from '../boards.service';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-board-form',
  templateUrl: './board-form.component.html',
  styleUrls: ['./board-form.component.css']
})
export class BoardFormComponent implements OnInit {

  boards:Board[];
  error:any;

  private model=new Board();

  constructor(
    private boardService:BoardsService
  ) { }

  ngOnInit() {
    this.model.isClosed=false;
  }

  submitBoard(){
    this.boardService.createBoard(this.model).subscribe(
      data=>{
        this.getBoards();
        return true;
      },
      error=>{
        console.error("error saving board!");
        return Observable.throw(error); 
      }
    )
  }

  getBoards(){
    this.boardService
      .getBoards()
      .subscribe(
        boards => this.boards = boards,
        err => this.error = err
      )
  }

}
