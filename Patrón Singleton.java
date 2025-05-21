/**
 * DbConnection - Implementación del patrón Singleton para conexión a base de datos relacional
 */
public class DbConnection {
    // Instancia única de la clase
    private static DbConnection instance;
    
    // Propiedades de conexión
    private Connection connection;
    private String url;
    private String username;
    private String password;
    
    // Constructor privado para evitar instanciación directa
    private DbConnection() {
        // Carga de propiedades de configuración desde archivo o entorno
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "user";
        this.password = "password";
    }
    
    /**
     * Método para obtener la instancia única, con sincronización doble
     * para evitar problemas de concurrencia
     */
    public static DbConnection getInstance() {
        // Primera verificación (sin bloqueo)
        if (instance == null) {
            // Bloqueo para garantizar creación única
            synchronized (DbConnection.class) {
                // Segunda verificación (con bloqueo)
                if (instance == null) {
                    instance = new DbConnection();
                }
            }
        }
        return instance;
    }
    
    /**
     * Obtiene una conexión a la base de datos
     */
    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            synchronized (this) {
                if (connection == null || connection.isClosed()) {
                    try {
                        // Cargar el driver de la base de datos
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        
                        // Crear conexión
                        connection = DriverManager.getConnection(url, username, password);
                        
                        // Configuración adicional
                        connection.setAutoCommit(false);
                    } catch (ClassNotFoundException e) {
                        throw new SQLException("Driver de base de datos no encontrado", e);
                    }
                }
            }
        }
        return connection;
    }
    
    /**
     * Cierra la conexión de forma segura
     */
    public void closeConnection() {
        synchronized (this) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                } finally {
                    connection = null;
                }
            }
        }
    }
    
    /**
     * Ejemplo de uso del pool de conexiones
     */
    public static void main(String[] args) {
        try {
            // Obtener la instancia única
            DbConnection dbInstance = DbConnection.getInstance();
            
            // Utilizar la conexión
            Connection conn = dbInstance.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            
            // Procesar resultados
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("name"));
            }
            
            // Cerrar recursos
            rs.close();
            stmt.close();
            
            // No cerramos la conexión aquí para aprovechar su reutilización
            
        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }
}