package bo.edu.ucb.ingsoft.bot;

import bo.edu.ucb.ingsoft.bot.chat.MascotaLongPullingBot;
import org.springframework.boot.SpringApplication;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("bo.edu.ucb.ingsoft.bot.dao")
public class BotApplication {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		return factoryBean.getObject();
	}

	public static void main(String[] args) {
		/* //Funcionalidad del bot
		ApplicationContext context = SpringApplication.run(BotApplication.class, args);
		try {
			// Inicializamos libreria de bots
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			// Registramos la implementación de nuestro BOT
			telegramBotsApi.registerBot(new MascotaLongPullingBot(context));
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		*/
		//funcionalidad rest
		SpringApplication.run(BotApplication.class, args);
	}

}
