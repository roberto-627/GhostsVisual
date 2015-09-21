package ghostsvisual;

/*
 * @Author Roberto Melara
 */

public class Player {
    //Declaracion de atributos.
    
    //Declaracion de arreglo de usuarios e inicializacion.
    public static Player usuarios[] = new Player[30];
    
    //Declaracion de contador de ultima posicion en arreglo de usuarios.
    public static int ultpos = 0;
    
    //Declaracion de contador que indica posicion de player logged in.
    public static int posuser1;
    
    //Declaracion de contador que indica posicion de player logged in.
    public static int posuser2;
    
    
    //Declaracion de atributos para usuarios.
    public String user;
    public String password;
    public int puntos;
    public String ult10[];
    
    //Constructor de clase Player.
    public Player(String usuario, String pass){
        user = usuario;
        password = pass;
        puntos = 0;
        ult10 = new String[10];
        
    }
    
    //Metodo para validacion de passwords y creacion de un nuevo objeto Player.(Sign Up)
    public static boolean ValidarPass(String pass, String passconfirm, String usern){
        //Declaracion de variables locales.
        boolean validacion;
        
        //Validacion de password.
        if(pass.equals(passconfirm)){
            //Si hay coincidencia de password se procede a la creacion del nuevo objeto Player.
            usuarios[ultpos] = new Player(usern, pass);
            posuser1 = ultpos;
            ultpos ++;
            validacion = true; 
            
        }else{
            validacion = false;
        }
        return validacion;
    }
    
    //Metodo para validacion de usuario ya creado y validacion de su propio pass.(Sign In)
    public static boolean ValidarSignIn(String user, String pass){
        //Declaracion de variables locales.
        boolean validacion;
        posuser1 = 0;
        
        //Busqueda de usuario.
        posuser1 = 0;
        for(int cont = 0; cont <= ultpos; cont++){
            if(usuarios[cont].user.equals(user)){                   
                    break;  
            }else{
                    posuser1 ++;
            }  
        }
        
        //Validacion de Password.
        if(pass.equals(usuarios[posuser1].password)){
            validacion = true;
        }else{
            validacion = false;
        }
        
        return validacion;
    }
    
    //Metodo para ordenar los player dependiendo de su score.
    public void ImprimirRanking(){
        
    }
}
