package bo.edu.ucb.ingsoft.bot.chat;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MascotaLongPullingBot extends TelegramLongPollingBot {
    /**
     * Atributo que sirve para guardar el proceso actual de los diferentes usuarios.
     */
    private Map<Long, AbstractProcess> usersSession;
    private boolean test = false;
    private List<BotApiMethod> testMessages = new ArrayList<>();
    private ApplicationContext context;
    //LOGGER
    private static Logger LOGGER = LoggerFactory.getLogger(MascotaLongPullingBot.class);

    public MascotaLongPullingBot(ApplicationContext context) {
        this.context = context;
        usersSession = new HashMap<>();
    }

    public MascotaLongPullingBot(ApplicationContext context, boolean test) {
        this.context = context;
        this.test = test;
        usersSession = new HashMap<>();
    }

    @Override
    public String getBotUsername() {
        return "MascotasSoftBot.";          /* return "t.me/mascotasjosebot.";*/
    }//MascotasSoftBot  original // nombre del bot

    @Override
    public String getBotToken() {
        return "5218989594:AAGrNwzWiDxap5B6x7SGFOMVl5wLVS7xAME";  /* return "5240106822:AAGvYbpaJ29E2Ti1srzISu9n3vf_MJsfEys";    */
    } //5218989594:AAGrNwzWiDxap5B6x7SGFOMVl5wLVS7xAME       original // key

    public void sendMyMessage(BotApiMethod method) throws TelegramApiException {
        LOGGER.info("Enviando mensaje: {} ",method);
        //System.out.println("Enviando mensaje: " + method);
        if (test) {
            // no enviamos
            testMessages.add(method);
        } else {
            this.execute(method);
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Primero identifico al usuario por chat Id Long
        Long chatId = update.getMessage().getChatId();
        LOGGER.info("===========> Recibiendo chatId: {} ",chatId);
        //System.out.println("\n\n===========> Recibiendo chatId: " + chatId);
        // Busco si ya existe Proceso en el map userSession
        AbstractProcess currentProcess = usersSession.get(chatId);

        if (currentProcess == null) { // Primera vez que se contacto con nostros.
            LOGGER.info("\"Creando proceso para el  chatId: {} ",chatId);
            //System.out.println("Creando proceso para el  chatId: " + chatId);
            // Debo crear el proceso por defecto
            currentProcess = new MenuProcessImpl();
            usersSession.put(chatId, currentProcess);
            LOGGER.info("Derivando la conversaci??n al proceso: {} ",currentProcess.getName());
            //System.out.println("Derivando la conversaci??n al proceso: " + currentProcess.getName());
            AbstractProcess nextProcess = currentProcess.handle(context, update, this);

            if (!nextProcess.equals(currentProcess)) { // Si el siguiente proceso es diferente lo iniciamos
                LOGGER.info("Iniciando siguiente proceso: {} ",nextProcess.getName());
                //System.out.println("Iniciando siguiente proceso: " + nextProcess.getName());
                nextProcess.handle(context, update, this);
            } else {
                LOGGER.info("No hay cambio de proceso, as?? que termina conversaci??n");
                //System.out.println("No hay cambio de proceso, as?? que termina conversaci??n");
            }
            usersSession.put(chatId, nextProcess);

        } else { // Ya existe un proceso
            LOGGER.info("Continuamos el proceso para el  chatId: {} proceso: {} ",chatId,currentProcess.getName());
           // System.out.println("Continuamos el proceso para el  chatId: " + chatId
            //        + " proceso: " + currentProcess.getName());
            AbstractProcess nextProcess = currentProcess.handle(context, update, this);

            if (!nextProcess.equals(currentProcess)) { // Si el siguiente proceso es diferente
                LOGGER.info("Iniciando siguiente proceso: {} ",nextProcess.getName());
                //System.out.println("Iniciando siguiente proceso: " + nextProcess.getName());
                nextProcess = nextProcess.handle(context, update, this);
            } else {
                System.out.println("No hay cambio de proceso, as?? que termina conversaci??n");
            }
            usersSession.put(chatId, nextProcess);
        }

    }

    public List<BotApiMethod> getTestMessages() {
        return testMessages;
    }
}
