package ng4.lang;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class TypeConverter {

	public String convert(BigInteger arg) {
		return arg.toString();
	}
	
	public BigInteger convertToBigInteger(String arg) {
		return new BigInteger(arg);
	}

}
