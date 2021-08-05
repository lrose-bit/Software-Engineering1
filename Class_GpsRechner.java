

/**
 * 
 */

/**
 * @author timof
 *
 */
public class Class_GpsRechner {


/**
 * @param arrayList_listOfCoordinates
 */
public Class_GpsRechner() {

}


public double method_PeilungKoordinaten(double breitenGrad1, double long1, double lat2,double long2) {
	double double_angel ;
	

 double_angel = (Math.toDegrees(Math.atan2((Math.sin(long2-long1)*Math.cos(lat2)),((Math.cos(breitenGrad1)*Math.sin(lat2))-((Math.sin(breitenGrad1)*Math.cos(lat2)*Math.cos(long2-long1)))))));


return  double_angel;
}


public double method_distance(double lat1, double long1, double lat2, double long2) {

	
double double_dist = Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long2-long1));
double_dist = double_dist*6371;
return double_dist;

  }
  
  public String method_direction(double double_angel) {
String string_direction = null;

if (double_angel>0&&double_angel<22.5) {
	 string_direction="N";
	
}else if (double_angel>22.5&&double_angel<45){
	 string_direction="NNO";
		
}else if (double_angel>45&&double_angel<67.5) {
	 string_direction="ENE";
		
}else if (double_angel>67.5&&double_angel<90) {
	 string_direction="E";
		
}else if (double_angel>90&&double_angel<112.5) {
	 string_direction="ESE";
		
}else if (double_angel>112.5&&double_angel<135) {
	 string_direction="SE";
		
}else if (double_angel>135&&double_angel<157.5) {
	string_direction="SSE";
}else if (double_angel>157.5&&double_angel<180) {
	string_direction="S";
}else if (double_angel>180&&double_angel<202.5) {
	string_direction="SSW";
}else if (double_angel>202.5&&double_angel<225) {
	string_direction="SW";
}else if (double_angel>225&&double_angel<247.5) {
	string_direction="WSW";
}else if (double_angel>247.5&&double_angel<270) {
	string_direction="W";
}else if (double_angel>270&&double_angel<292.5) {
	string_direction="WNW";
}else if (double_angel>292.5&&double_angel<315) {
	string_direction="NW";
}else if (double_angel>315&&double_angel<337.5) {
	string_direction="NNW";
}else if (double_angel>337.5) {
	string_direction="N";
}else {
	
}
	return string_direction;
}





}
