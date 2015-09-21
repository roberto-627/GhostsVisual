package ghostsvisual;
/*
 * @Author Roberto Melara
 */

//Importar random
import java.util.Random;

public class Tablero {
    //Declarar Random.
    public static Random  rnd = new Random();
    
    //Declarar arreglo que contendra el tablero.
    public static int tablero[][] = new int[6][6];
    
    //Constructor de tablero.
    public Tablero(){
        //Ordenacion default de tablero.
        tablero[0][0] = 0; tablero[0][1] = 0;tablero[0][2] = 0;tablero[0][3] = 0;tablero[0][4] = 0;tablero[0][5] = 0;
        tablero[1][0] = 0; tablero[1][1] = 0;tablero[1][2] = 0;tablero[1][3] = 0;tablero[1][4] = 0;tablero[1][5] = 0;
        tablero[2][0] = 0; tablero[2][1] = 0;tablero[2][2] = 0;tablero[2][3] = 0;tablero[2][4] = 0;tablero[2][5] = 0;
        tablero[3][0] = 0; tablero[3][1] = 0;tablero[3][2] = 0;tablero[3][3] = 0;tablero[3][4] = 0;tablero[3][5] = 0;
        tablero[4][0] = 0; tablero[4][1] = 0;tablero[4][2] = 0;tablero[4][3] = 0;tablero[4][4] = 0;tablero[4][5] = 0;
        tablero[5][0] = 0; tablero[5][1] = 0;tablero[5][2] = 0;tablero[5][3] = 0;tablero[5][4] = 0;tablero[5][5] = 0;  
    }
    
    //Funciones para manejo de TABLERO MODO DE JUEGO: ALEATORIO.
    //Funcion para asignar los fantasmas del Player 1 en posicion aleatoria(8x8).
    public void SortearGhostsPlayer18x8(){
        //Coloca los fantasmas buenos en posicion aleatoria.
        int player1fantasmasbuenoscolocados = 1;
        do{
            int fila = rnd.nextInt(2);
            int columna = rnd.nextInt(5-1)+1;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 2;
                player1fantasmasbuenoscolocados ++;       
            }     
        }while(player1fantasmasbuenoscolocados <= 4);
        //Llena las posiciones aun disponibles para el player 1 con sus fantasmas malos.
        for(int f = 0; f <= 1; f ++){
            for(int c = 1; c <= 4; c++){
              if(tablero[f][c] == 0){
                  tablero[f][c] = 1;
              }  
            }
        }
    }

    //Funcion para asignar los fantasmas del Player 2 en posicion aleatoria(8x8).
    public void SortearGhostsPlayer28x8(){
        //Coloca los fantasmas buenos en posicion aleatoria.
        int player2fantasmasbuenoscolocados = 1;
        do{
            int fila = rnd.nextInt(6-4)+4;
            int columna = rnd.nextInt(5-1)+1;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 4;
                player2fantasmasbuenoscolocados ++;       
            }     
        }while(player2fantasmasbuenoscolocados <= 4);
        //Llena las posiciones aun disponibles para el player 2 con sus fantasmas malos.
        for(int f = 4; f <= 5; f ++){
            for(int c = 1; c <= 4; c++){
              if(tablero[f][c] == 0){
                  tablero[f][c] = 3;
              }  
            }
        }
    }
    
    //Funcion para asignar los fantasmas del Player 1 en posicion aleatoria(4x4).
    public void SortearGhostsPlayer14x4(){
        //Coloca los fantasmas buenos en posicion aleatoria.
        int player1fantasmasbuenoscolocados = 1;
        do{
            int fila = rnd.nextInt(2);
            int columna = rnd.nextInt(4-2)+2;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 2;
                player1fantasmasbuenoscolocados ++;       
            }     
        }while(player1fantasmasbuenoscolocados <= 2);
        //Llena las posiciones aun disponibles para el player 1 con sus fantasmas malos.
        for(int f = 0; f <= 1; f ++){
            for(int c = 2; c <= 3; c++){
              if(tablero[f][c] == 0){
                  tablero[f][c] = 1;
              }  
            }
        }
    }
    
    //Funcion para asignar los fantasmas del Player 2 en posicion aleatoria(4x4).
    public void SortearGhostsPlayer24x4(){
        //Coloca los fantasmas buenos en posicion aleatoria.
        int player1fantasmasbuenoscolocados = 1;
        do{
            int fila = rnd.nextInt(6-4)+4;
            int columna = rnd.nextInt(4-2)+2;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 4;
                player1fantasmasbuenoscolocados ++;       
            }     
        }while(player1fantasmasbuenoscolocados <= 2);
        //Llena las posiciones aun disponibles para el player 2 con sus fantasmas malos.
        for(int f = 4; f <= 5; f ++){
            for(int c = 2; c <= 3; c++){
              if(tablero[f][c] == 0){
                  tablero[f][c] = 3;
              }  
            }
        }
    }
    
    //Funcion para asignar los fantasmas del Player 1 en posicion aleatoria(2x2).
    public void SortearGhostsPlayer12x2(){
        //Coloca los fantasmas buenos en posicion aleatoria.
            int fila = 0;
            int columna = rnd.nextInt(4-2)+2;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 2;       
            }     
        //Llena las posiciones aun disponibles para el player 1 con sus fantasmas malos.
            for(int c = 2; c <= 3; c++){
              if(tablero[fila][c] == 0){
                  tablero[fila][c] = 1;
              }  
            }
    }
    
    //Funcion para asignar los fantasmas del Player 2 en posicion aleatoria(2x2).
    public void SortearGhostsPlayer22x2(){
        //Coloca los fantasmas buenos en posicion aleatoria.
            int fila = 5;
            int columna = rnd.nextInt(4-2)+2;
            if(tablero[fila][columna] == 0){
                tablero[fila][columna] = 4;       
            }     
        //Llena las posiciones aun disponibles para el player 2 con sus fantasmas malos.
            for(int c = 2; c <= 3; c++){
              if(tablero[fila][c] == 0){
                  tablero[fila][c] = 3;
              }  
            }
    }
    
    
    //Funciones para manejo de TABLERO MODO DE JUEGO: MANUAL.
    //Player 1.
    //Colocar fantasmas buenos Player 1 (8x8).
    public void ColocarBuenosPlayer18x8(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <= 1){
            if(columnaseleccionada >=1 && columnaseleccionada <=4){
                tablero[filaseleccionada][columnaseleccionada] = 2;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Colocar fantasmas malos Player 1 (8x8).
    public void ColocarMalosPlayer18x8(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <= 1){
            if(columnaseleccionada >=1 && columnaseleccionada <=4){
                tablero[filaseleccionada][columnaseleccionada] = 1;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Colocar fantasmas buenos Player 1 (4x4).
    public void ColocarBuenosPlayer14x4(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <= 1){
            if(columnaseleccionada >=2 && columnaseleccionada <=3){
                tablero[filaseleccionada][columnaseleccionada] = 2;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Colocar fantasmas malos Player 1 (4x4).
    public void ColocarMalosPlayer14x4(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <= 1){
            if(columnaseleccionada >=2 && columnaseleccionada <=3){
                tablero[filaseleccionada][columnaseleccionada] = 1;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Colocar fantasmas buenos Player 1 (2x2).
    public void ColocarBuenosPlayer12x2(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada == 0){
            if(columnaseleccionada >=2 && columnaseleccionada <=3){
                tablero[filaseleccionada][columnaseleccionada] = 2;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Colocar fantasmas malos Player 1 (2x2).
    public void ColocarMalosPlayer12x2(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada == 0){
            if(columnaseleccionada >=2 && columnaseleccionada <=3){
                tablero[filaseleccionada][columnaseleccionada] = 1;
            }
        }else{
            //Tirar mensaje de invalido.
        }
    }
    
    //Player 2.
    //Colocar fantasmas buenos Player 2 (8x8).
    public void ColocarBuenosPlayer28x8(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <=5 && filaseleccionada >= 4){
            if(columnaseleccionada <= 4 && columnaseleccionada >=1){
                tablero[filaseleccionada][columnaseleccionada] = 4;
            }
        }
    }
    
    //Colocar fantasmas malos Player 2 (8x8).
    public void ColocarMalosPlayer28x8(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <=5 && filaseleccionada >= 4){
            if(columnaseleccionada <= 4 && columnaseleccionada >=1){
                tablero[filaseleccionada][columnaseleccionada] = 3;
            }
        }
    }
    
    //Colocar fantasmas buenos Player 2 (4x4).
    public void ColocarBuenosPlayer24x4(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <=5 && filaseleccionada >= 4){
            if(columnaseleccionada <= 3 && columnaseleccionada >=2){
                tablero[filaseleccionada][columnaseleccionada] = 4;
            }
        }
    }
    
    //Colocar fantasmas malos Player 2 (4x4).
    public void ColocarMalosPlayer24x4(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada <=5 && filaseleccionada >= 4){
            if(columnaseleccionada <= 3 && columnaseleccionada >=2){
                tablero[filaseleccionada][columnaseleccionada] = 3;
            }
        }
    }
    
    //Colocar fantasmas buenos Player 2 (2x2).
    public void ColocarBuenosPlayer22x2(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada == 5){
            if(columnaseleccionada <= 3 && columnaseleccionada >=2){
                tablero[filaseleccionada][columnaseleccionada] = 4;
            }
        }
    }
    
    //Colocar fantasmas malos Player 2 (2x2).
    public void ColocarMalosPlayer22x2(int filaseleccionada, int columnaseleccionada){
        if(filaseleccionada == 5){
            if(columnaseleccionada <= 3 && columnaseleccionada >=2){
                tablero[filaseleccionada][columnaseleccionada] = 3;
            }
        }
    }
    
    
    //Funciones para validacion de movimiento de pieza.
    //Movimientos del Player 1.
    //Mover pieza del Player 1 abajo.
    public void MoverAbajoPlayer1(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 1 || tablero[filaActual][columnaActual] == 2){
            if(tablero[filaActual + 1][columnaActual] == 0 ){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual + 1][columnaActual] == 3){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual + 1][columnaActual] == 4){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    }
    
    //Mover pieza del Player 1 arriba.
    public void MoverArribaPlayer1(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 1 || tablero[filaActual][columnaActual] == 2){
            if(tablero[filaActual - 1][columnaActual] == 0 ){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual - 1][columnaActual] == 3){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual - 1][columnaActual] == 4){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    } 
    
    //Mover pieza del Player 1 derecha.
    public void MoverDerechaPlayer1(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 1 || tablero[filaActual][columnaActual] == 2){
            if(tablero[filaActual][columnaActual + 1] == 0 ){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual + 1] == 3){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual + 1] == 4){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    }
    
    //Mover pieza del Player 1 derecha.
    public void MoverIzquierdaPlayer1(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 1 || tablero[filaActual][columnaActual] == 2){
            if(tablero[filaActual][columnaActual - 1] == 0 ){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual - 1] == 3){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual - 1] == 4){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    }
    
    //Movimientos del Player 2.
    //Mover pieza del Player 2 arriba.
    public void MoverArribaPlayer2(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 3 || tablero[filaActual][columnaActual] == 4){
            if(tablero[filaActual - 1][columnaActual] == 0 ){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual - 1][columnaActual] == 1){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual - 1][columnaActual] == 2){
                tablero[filaActual - 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    }
    
    //Mover pieza del Player 2 derecha.
    public void MoverDerechaPlayer2(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 3 || tablero[filaActual][columnaActual] == 4){
            if(tablero[filaActual][columnaActual + 1] == 0 ){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual + 1] == 1){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual + 1] == 2){
                tablero[filaActual][columnaActual + 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            }
        }else{
        }
    }
    
    //Mover pieza del Player 2 derecha.
    public void MoverIzquierdaPlayer2(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 3 || tablero[filaActual][columnaActual] == 4){
            if(tablero[filaActual][columnaActual - 1] == 0 ){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual - 1] == 1){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual][columnaActual - 1] == 2){
                tablero[filaActual][columnaActual - 1] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
            //Tirar mensaje de Movimiento Invalido.   
            }
        }else{
            //Tirar mensaje de Movimiento Invalido.
        }
    }
    
    //Mover pieza del Player 1 abajo.
    public void MoverAbajoPlayer2(int filaActual, int columnaActual){
        if(tablero[filaActual][columnaActual] == 3 || tablero[filaActual][columnaActual] == 4){
            if(tablero[filaActual + 1][columnaActual] == 0 ){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual + 1][columnaActual] == 1){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else if(tablero[filaActual + 1][columnaActual] == 2){
                tablero[filaActual + 1][columnaActual] = tablero[filaActual][columnaActual];
                tablero[filaActual][columnaActual] = 0;
            }else{
                //Tirar mensaje de Movimiento Invalido.
            }
        }else{
            //Tirar mensaje de Movimiento Invalido.
        }
    }
    
    
    /*Funcion para Imprimir tablero, existe con el proposito de que debuggear (para probar el tablero) y a la vez que se pueda ver (por motivos de 
    evaluacion) lo que ocurre en el juego.*/
    public void PrintTablero(){
        for(int f = 0; f < tablero.length; f ++){
            System.out.println();
            for(int c = 0; c < tablero[f].length; c++){
              System.out.print(tablero[f][c]);  
            }
        }
    }
    
}
