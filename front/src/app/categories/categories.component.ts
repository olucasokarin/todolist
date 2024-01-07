import { Component } from '@angular/core';
import { ItemCategoryComponent } from '../item-category/item-category.component';
import { NgFor } from '@angular/common';
import { Category } from '../category';
import { CatoryService } from '../catory.service';
import { Observable } from 'rxjs';
import { ModalComponent } from '../modal/modal.component';
import { MatDialog, MatDialogConfig } from '@angular/material/dialog';

@Component({
  selector: 'app-categories',
  standalone: true,
  imports: [ItemCategoryComponent, NgFor, ModalComponent],
  templateUrl: './categories.component.html',
  styleUrl: './categories.component.css'
})
export class CategoriesComponent {

  categories: Category[] = []


  constructor(private service: CatoryService, private dialog: MatDialog) { }


  ngOnInit(): void {
    this.getCategories()
  }

  getCategories() {
    this.service.getCategories()
      .subscribe((categories) => this.categories = categories);
  }

  openDialog() {

    console.log("open dialog")
    const dialogConfig = new MatDialogConfig()

    dialogConfig.disableClose = true
    dialogConfig.autoFocus = true

    this.dialog.open(ModalComponent, dialogConfig)
  }

}
