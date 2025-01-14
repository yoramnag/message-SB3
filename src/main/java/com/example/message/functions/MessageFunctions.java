package com.example.message.functions;

import com.example.message.dto.TransactionsMsgDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunctions {

    private static final Logger log = LoggerFactory.getLogger(MessageFunctions.class);

    @Bean
    public Function<TransactionsMsgDto,TransactionsMsgDto> creditCard() {
        return transactionsMsgDto -> {
            log.info("Sending creditCard with the details : " +  transactionsMsgDto.toString());
            return transactionsMsgDto;
        };
    }

    @Bean
    public Function<TransactionsMsgDto,Double> amount() {
        return transactionsMsgDto -> {
            log.info("Sending amount with the details : " +  transactionsMsgDto.toString());
            return transactionsMsgDto.amount();
        };
    }

}
