public class UsersModel {

    private int IdUser; 
    private String Descricao;
    public static final int IDADE_MINIMA = 18;
       
    public UsersModel(){};

    public UsersModel(int idUser, String descricao) {
        this.idUser = idUser;
        this.descricao = descricao;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public fetchUsers() { return [];}
    
    public allUsers() {return [];}
    
    public static getUsers() {return [];}
    
}