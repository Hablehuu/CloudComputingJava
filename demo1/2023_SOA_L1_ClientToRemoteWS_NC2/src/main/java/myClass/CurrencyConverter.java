package myClass;

import java.math.BigInteger;
import com.soap.ws.client.NumberConversion;
import com.soap.ws.client.NumberConversionSoapType;
import com.soap.ws.currency.XigniteCurrenciesSoap;
import com.soap.ws.currency.XigniteCurrencies;
import com.soap.ws.currency.ExchangeConversion;
import com.soap.ws.calc.CalculatorSoap;
import com.soap.ws.calc.Calculator;
public class CurrencyConverter {

	public void CurrencyConvertor() {}
	
	
	
	public String convert(String from, String to, double amount,double amount2) {
		
		XigniteCurrencies convert = new XigniteCurrencies();
		XigniteCurrenciesSoap soap = convert.getXigniteCurrenciesSoap();
		ExchangeConversion result1 = soap.convertRealTimeValue(to, from, amount);
		Calculator calc = new Calculator();
		CalculatorSoap calcsoap = calc.getCalculatorSoap();
		if(result1.getResult() == amount && amount == 0.0) {
			int result2 = calcsoap.add((int)result1.getResult(), (int)amount2);
			return toWords(result2);
		}
		if(result1.getResult() == 0.0) {
			int result2 = calcsoap.add((int)amount, (int)amount2);
			return toWords(result2); ///return("API limit on the currency converter reached");
		}
		//int result2 = calcsoap.add((int)result1.getResult(), (int)amount2); 
		int result2 = calcsoap.add((int)amount, (int)amount2);
		return toWords(result2);
		//return toWords((int)result1.getResult());
	}
	/*
	public String toWords(String amount) {
		BigInteger bigamount = new BigInteger(amount);
		NumberConversion word = new NumberConversion(); //created service object
		NumberConversionSoapType wordsoap = word.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = wordsoap.numberToWords(bigamount);
        return result;
	}*/
	
	
	
	
	public String toWords(int amount) {
		String stramount = Integer.toString(amount);
		BigInteger bigamount = new BigInteger(stramount);
		NumberConversion convert = new NumberConversion();
        NumberConversionSoapType soap = convert.getNumberConversionSoap();
        String result = soap.numberToWords(bigamount);
        if(result == null) {
        	result = "the amount needs to be higher than zero";
        }
        return result;
	}
}
