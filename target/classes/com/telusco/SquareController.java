package com.telusco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;;

@Controller
public class SquareController {

	@RequestMapping("/square")
	public void square()
	{
		System.out.println("SQUARE IS");
	}
}
