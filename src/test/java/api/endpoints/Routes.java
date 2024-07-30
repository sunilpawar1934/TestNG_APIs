package api.endpoints;
/*
 * URL --> BaseURI + Endpoint
 * https://petstore.swagger.io/v2
 */
//User modules


public class Routes {
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String update_url=base_url+"/user/{username}";
	public static String deete_url=base_url+"/user/{username}";

}
