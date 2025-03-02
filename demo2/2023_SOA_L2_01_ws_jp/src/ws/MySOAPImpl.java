package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.ZoneId;

@WebService
public class MySOAPImpl implements MySOAP{
	@Override
	@WebMethod
	public String isPrime(int number) {
		
		if (number <= 1) {
            return "numbers 1 and smaller are not primes";
        }
        
        if (number <= 3) {
            return "numbers 2 and 3 are primes"; 
        }
        
        // Check if the number is divisible by 2 or 3
        if (number % 2 == 0 || number % 3 == 0) {
            return "number is not a prime";
        }
        
        // Start checking divisors from 5 up to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return "number is not a prime";
            }
        }
        
        return "number is a prime"; // If no divisors were found, the number is prime
	}

	@Override
	@WebMethod
	public String time(String gmt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now(ZoneId.of(gmt));
		return dtf.format(now);
	}

	@Override
	@WebMethod
	public int poundsToKilos(int pounds) {
		
		return (int) (pounds * 0.45359237);
	}

	@Override
	@WebMethod
	public int kilosToPounds(int kilos) {
		
		return (int) (kilos * 2.20462262);
	}

	@Override
	@WebMethod
	public int kilometersToMiles(int kilometers) {
		
		return (int) (kilometers * 0.621371192);
	}

	@Override
	@WebMethod
	public int milesToKilometers(int miles) {
		
		return (int) (miles * 1.609344);
	}

	@Override
	@WebMethod
	public int inchesToCentimeters(int inches) {
		
		return (int) (inches * 2.54);
	}

	@Override
	@WebMethod
	public int centimetersToInches(int centimeters) {
		
		return (int) (centimeters * 0.393700787);
	}

	@Override
	@WebMethod
	public int feetToMeters(int feet) {
		
		return (int) (feet * 0.3048);
	}

	@Override
	@WebMethod
	public int metersToFeet(int meters) {
		
		return (int) (meters *3.2808399);
	}
	
	
}