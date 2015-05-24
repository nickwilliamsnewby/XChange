package com.xeiam.xchange.bitmarket.service.polling;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.bitmarket.BitMarketAdapters;
import com.xeiam.xchange.bitmarket.dto.account.BitMarketAccountInfo;
import com.xeiam.xchange.dto.account.AccountInfo;
import com.xeiam.xchange.exceptions.ExchangeException;
import com.xeiam.xchange.exceptions.NotAvailableFromExchangeException;
import com.xeiam.xchange.exceptions.NotYetImplementedForExchangeException;
import com.xeiam.xchange.service.polling.account.PollingAccountService;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author kfonal
 */
public class BitMarketAccountService extends BitMarketAccountServiceRaw implements PollingAccountService {

  public BitMarketAccountService(Exchange exchange) {

    super(exchange);
  }

  @Override public AccountInfo getAccountInfo()
      throws ExchangeException, NotAvailableFromExchangeException, NotYetImplementedForExchangeException, IOException {

    BitMarketAccountInfo accountInfo = getBitMarketAccountInfo();
    return BitMarketAdapters.adaptAccountInfo(accountInfo.getBalance(), exchange.getExchangeSpecification().getUserName());
  }

  @Override public String withdrawFunds(String s, BigDecimal bigDecimal, String s1)
      throws ExchangeException, NotAvailableFromExchangeException, NotYetImplementedForExchangeException, IOException {
    return null;
  }

  @Override public String requestDepositAddress(String s, String... strings)
      throws ExchangeException, NotAvailableFromExchangeException, NotYetImplementedForExchangeException, IOException {
    return null;
  }
}
