/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurapilascolas;

import java.util.Arrays;

/**
 *
 * @author venot
 */
public class EstructuraPilasColas {

    public static void main(String[] args) {
        System.out.println("Colas y pilas Implemetcion generica");
        ColaTareas <String> colaTarea = new ColaTareas<>();
        colaTarea.agregarTarea(new Tarea(1, "Tarea 12"));
        colaTarea.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTarea.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTarea.agregarTarea(new Tarea(5, "Tarea 5"));
        while (!colaTarea.estaVacio()) {            
            Tarea <String> tareaProsseTarea = colaTarea.procesarTarea();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + tareaProsseTarea.getId()+tareaProsseTarea.getAtributito());
        }
        ColaTareas <Integer> colaInt = new ColaTareas<>();
        colaInt.agregarTarea(new Tarea(6, 1345234));
        colaInt.agregarTarea(new Tarea(7, 13425));
        colaInt.agregarTarea(new Tarea(8, 876543));
        colaInt.agregarTarea(new Tarea(9, 124355));
        colaInt.agregarTarea(new Tarea(10, 31420));
        
        while (!colaInt.estaVacio()) {            
            Tarea <Integer> colaIntes  = colaInt.procesarTarea();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + colaIntes.getId()+colaIntes.getAtributito());
        }
        
        ColaTareas <String[]> colaArregloString = new ColaTareas<>();
        colaArregloString.agregarTarea(new Tarea(6, new String[]{"sda","asdafa"}));
        colaArregloString.agregarTarea(new Tarea(7, new String[]{"eytjt","abgds"}));
        colaArregloString.agregarTarea(new Tarea(8, new String[]{"sdaf","cdsvf"}));
        
        while (!colaArregloString.estaVacio()) {            
            Tarea <String[]> colaIntes  = colaArregloString.procesarTarea();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + colaIntes.getId()+ Arrays.toString(colaIntes.getAtributito()));
        }
        
        
        
        
        ColaTareas <int[]> colaArregloInt = new ColaTareas<>();
        
        colaArregloInt.agregarTarea(new Tarea(34, new int[]{12,23}));
        colaArregloInt.agregarTarea(new Tarea(23, new int[]{54,34}));
        colaArregloInt.agregarTarea(new Tarea(23, new int[]{454,54534}));
        
        while (!colaArregloInt.estaVacio()) {            
            Tarea <int[]> colaIntes  = colaArregloInt.procesarTarea();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + colaIntes.getId()+ Arrays.toString(colaIntes.getAtributito()));
        }
        
        
        
        
        
        
        PilasTarea<String> pilaTarea = new PilasTarea<>();
        pilaTarea.agregarTarea(new Tarea(23, "sada"));
        pilaTarea.agregarTarea(new Tarea(24, "das"));
        pilaTarea.agregarTarea(new Tarea(25, "vfs"));
        pilaTarea.agregarTarea(new Tarea(26, "gt"));
        
        while (!pilaTarea.estaVacio()) {            
            Tarea <String> tareaProsseTarea = pilaTarea.procesarPila();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + tareaProsseTarea.getId()+tareaProsseTarea.getAtributito());
        }
        
        PilasTarea<Integer> pilaInt = new PilasTarea<>();
        pilaInt.agregarTarea(new Tarea(23, 4252));
        pilaInt.agregarTarea(new Tarea(24, 4252));
        pilaInt.agregarTarea(new Tarea(25, 4252));
        pilaInt.agregarTarea(new Tarea(26, 4252));
        
        while (!pilaInt.estaVacio()) {            
            Tarea <Integer> tareaProsseTarea = pilaInt.procesarPila();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + tareaProsseTarea.getId()+tareaProsseTarea.getAtributito());
        }
        
        
        
        
        
        PilasTarea<String[]> pilaArregString = new PilasTarea<>();
        pilaArregString.agregarTarea(new Tarea(0, new String[]{"sda","asdafa"}));
        pilaArregString.agregarTarea(new Tarea(45, new String[]{"drw","nfd"}));
        pilaArregString.agregarTarea(new Tarea(56, new String[]{"bgr","sfscs"}));
        pilaArregString.agregarTarea(new Tarea(57, new String[]{"qrwrg","lukyjgh"}));
        pilaArregString.agregarTarea(new Tarea(58, new String[]{"zxcdsv","mjnh"}));
        
        while (!pilaArregString.estaVacio()) {            
            Tarea <String[]> tareaProsseTarea = pilaArregString.procesarPila();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + tareaProsseTarea.getId()+Arrays.toString(tareaProsseTarea.getAtributito()));
        }
        
        PilasTarea<int[]> pilaArregint = new PilasTarea<>();
        pilaArregint.agregarTarea(new Tarea(2, new int[]{43,234}));
        pilaArregint.agregarTarea(new Tarea(3, new int[]{43,234}));
        pilaArregint.agregarTarea(new Tarea(4, new int[]{43,234}));
        while (!pilaArregint.estaVacio()) {            
            Tarea <int[]> tareaProsseTarea = pilaArregint.procesarPila();
            System.out.println("Procesando Tarea de la cola:" );
            System.out.println("\n \t Sale----->" + tareaProsseTarea.getId()+Arrays.toString(tareaProsseTarea.getAtributito()));
        }
        
        
    }
}
