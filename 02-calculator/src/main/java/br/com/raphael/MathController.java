package br.com.raphael;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphael.exception.UnsuportedMathOperationException;
import br.com.raphael.math.services.NumberConverterService;
import br.com.raphael.math.services.SimpleMathService;

@RestController 
public class MathController {

	/*
	 * http://localhost:8080/{operation}/{number}/{number}
	 */
	
	@Autowired
	private SimpleMathService math;
	
	@Autowired
	private NumberConverterService nc;
	
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value="numberOne") String numberOne, @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.sum(nc.convertToDouble(numberOne), nc.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value="numberOne") String numberOne, @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.subtraction(nc.convertToDouble(numberOne), nc.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value="numberOne") String numberOne, @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.multiplication(nc.convertToDouble(numberOne), nc.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable(value="numberOne") String numberOne, @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.division(nc.convertToDouble(numberOne), nc.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/avg/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable(value="numberOne") String numberOne, @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.average(nc.convertToDouble(numberOne), nc.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sqrt/{number}", method=RequestMethod.GET)
	public Double squareRoot(@PathVariable(value="number") String number) throws Exception {
		if (!nc.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return math.squareRoot(nc.convertToDouble(number));
	}
	
}
