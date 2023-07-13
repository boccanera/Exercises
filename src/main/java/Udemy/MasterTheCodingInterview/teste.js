class myArray{
                         constructor(){
                             this.data = {}
                             this.length = 0
                         }

                     push(item){
                         this.data[this.length] = item
                         this.length++
                         return this.length
                     }

                         delete(index){
                            const item = this.data[index]
                             this.shiftItems(index)
                         }

                         shiftItems(){

                         }
                     }

                     const newArray = new myArray()
                     newArray.push(54)
                     newArray.push(23)
                     newArray.push(31)
                     console.log(newArray)
