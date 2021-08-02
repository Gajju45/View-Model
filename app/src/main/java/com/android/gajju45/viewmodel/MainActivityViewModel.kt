package com.android.gajju45.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

 var count=0

 fun getCurrentCount(): Int {
  return count

 }
 fun updateCount(): Int {
  return count++
 }
 fun  decrement(): Int {
  return count--
 }
}