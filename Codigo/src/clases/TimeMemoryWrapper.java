/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.lang.management.ManagementFactory;

/**
 *
 * @author Rodolfo
 */
public class TimeMemoryWrapper {
    private busquedaWrapper busqueda;
    private SorterWrapper sortear;
    private SorterWrapper2 sortear2;
    private int[] array;
    private int itemBuscar;
    private int resultSearch;
    private long memoryUsed;
    private long runTime;

    public void setSortear2(SorterWrapper2 sortear2) {
        this.sortear2 = sortear2;
    }

        public void setArray(int[] array) {
            this.array = array;
        }

        public int getResultSearch() {
            return resultSearch;
        }

        public void setItemBuscar(int itemBuscar) {
            this.itemBuscar = itemBuscar;
        }


        public void setBusqueda(busquedaWrapper busqueda) {
            this.busqueda = busqueda;
        }

        public void setSortear(SorterWrapper sortear) {
            this.sortear = sortear;
        }
        
        public long run(){
            long timeInit=0, timeEnd=0,memoryInit=0,memoryEnd=0;
            memoryInit = Utils.memoryHistogram();
            timeInit = System.nanoTime();
            if(busqueda!=null){                
                resultSearch = busqueda.busqueda(array, itemBuscar);               
            }else if(sortear!=null){               
                sortear.sortear(array);                
            }else if(sortear2!=null){
                sortear2.sortear(array, 0, array.length-1);                
            }
            timeEnd = System.nanoTime();
            memoryEnd = Utils.memoryHistogram();
            System.out.println("memory ini => "+memoryInit);
            System.out.println("memory End => "+memoryEnd+"\n");
            runTime = timeEnd-timeInit;
            memoryUsed = Math.abs(memoryInit-memoryEnd);
            return runTime;
        }

    public long getMemoryUsed() {
        return memoryUsed;
    }

    public long getRunTime() {
        return runTime;
    }

        public int[] getArray() {
            return array;
        }
}
