package br.com.raphael.math.services;

import org.springframework.stereotype.Service;

@Service
public class NumberConverterService {

	public Double convertToDouble(String strNumber) {
		if (strNumber == null) {
			return 0D;
		}
		String number = strNumber.replaceAll(",", "."); // Substitui as virgulas por ponto.
		if (isNumeric(number)) {
			return Double.parseDouble(number); // transforma em um double
		}
		return 0D;
	}

	public boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		String number = strNumber.replaceAll(",", "."); // Substitui as virgulas por ponto.
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // regex que verifica se é um número.
	}

}
