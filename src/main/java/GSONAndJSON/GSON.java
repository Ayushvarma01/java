package GSONAndJSON;

import com.google.gson.Gson;

public class GSON {
	public static void main(String[] args) {
		String json = "{\"id\":\"1\",\"name\":\"Ayush varma\"}";
		Gson gson = new Gson();
		GsonModel model = gson.fromJson(json, GsonModel.class);
		System.out.println(model.getInd());
		System.out.println(model.getName());
	}
}
