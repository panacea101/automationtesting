package ApiTesting;


import java.io.InputStreamReader;
import java.net.URL;
import java.text.Normalizer;
import java.util.Map;
import org.testng.Assert;
import com.google.gson.Gson;


public class SocialAccounts {

public static void verifySocialAccounts(String twitter, String instagram) throws Exception {

        URL url = new URL("https://marketingapi.wheelsup.com/api/initial-data/?format=json");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        MyKeys social = new Gson().fromJson(reader, MyKeys.class);
        
        String twitterKey = social.keys.get("twitter").toLowerCase();
        String instaKey = social.keys.get("instagram");
        
	    twitterKey = Normalizer.normalize(twitterKey.trim(), Normalizer.Form.NFKC);
	    instaKey = Normalizer.normalize(instaKey.trim(), Normalizer.Form.NFKC);       
	    twitter = Normalizer.normalize(twitter.toLowerCase().trim(), Normalizer.Form.NFKC);
	    instagram = Normalizer.normalize(instagram.trim(), Normalizer.Form.NFKC);
	    
	    
        if (twitter != null) {
        	twitter.equals(twitterKey);
        }
        Assert.assertEquals(instagram, instaKey);

    }

    private class MyKeys {
        Map<String, String> keys;
    }
    
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String twitterUrl = "https://twitter.com/WheelsUp​";
		String instagramUrl = "http://instagram.com/wheelsup8760";
		
        verifySocialAccounts(twitterUrl, instagramUrl);
	}

}
