import { Component, Input } from '@angular/core';
import { Category } from '../category';

@Component({
  selector: 'app-item-category',
  standalone: true,
  imports: [],
  templateUrl: './item-category.component.html',
  styleUrl: './item-category.component.css'
})
export class ItemCategoryComponent {

  @Input() category?: Category
  

}
