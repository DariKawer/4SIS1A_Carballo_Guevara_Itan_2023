public class MainPong {
    /*
     * Del profe:
     * Ping Pong
     * -2 jugadores
     * -Scroll
     * -2-3 partidas
     * -Score
     * 
     * lo mio:
     * -3 dificultades
     * Al elegir una de de estas, la pelota reincia su posicion y el contador de score se reinicia tambien
     * -facil - la raqueta ira rapida y la pelota ira lenta
     * -medio - la raqueta ira medio rapido-lenta y la pelota ira rapida
     * -dficil - la raqueta ira lenta (pero no tan lenta xd) y la pelota ira super rapido
     * -menu con las dificultades
     * -boton para salir en el menu
     * -Esc para pausar el juego y mostrar el menu
     */
    
    public static void main(String[] args) {
        Pong pingpong = new Pong();
        pingpong.setVisible(true);
        
    }
}