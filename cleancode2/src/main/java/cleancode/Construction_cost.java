package cleancode;

public class Construction_cost {
	
	public static double cost_calculator(double area,boolean is_automated,String material_standard)
	{
		
		switch(material_standard)
		{
			case "use_standard": return area*1200;
			
			case "use_above_standard": return area*1500;
			
			case "need_standard": if(is_automated)
					{
						return area*2500;
					}
					return area*1800;
			default:return 0;
		}
	}

}
