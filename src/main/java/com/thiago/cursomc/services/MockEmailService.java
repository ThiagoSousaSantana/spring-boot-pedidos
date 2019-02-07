package com.thiago.cursomc.services;

import com.thiago.cursomc.domain.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

import javax.mail.internet.MimeMessage;


public class MockEmailService extends AbstractEmailService {

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendEmail(SimpleMailMessage obj) {
        LOG.info("Simulando envio de email");
        LOG.info(obj.toString());
        LOG.info("Email enviado");
    }

    @Override
    public void sendHtmlEmail(MimeMessage msg) {
        LOG.info("Simulando envio de email html");
        LOG.info(msg.toString());
        LOG.info("Email enviado");
    }


}
