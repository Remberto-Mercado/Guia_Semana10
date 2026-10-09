package notificaciones;

public class MainReto {
    public static void main(String[] args) {
        Notificacion push = new NotificacionPush(
            "dispositivo-9", "Recordatorio", 4);
        push.enviar(2);
    }
}
