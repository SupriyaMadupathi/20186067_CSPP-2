import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
//@author SupriyaMadupathi
class User {

	private String username;
	private List<String> friends = new List<String>();

	User(String name, String[] frnd) {
		this.username = name;
		for (int i = 0; i < frnd.length; i++) {
			friends.add(frnd[i]);
		}
	}
	public String getUsername() {
		return username;
	}
	public List<String> getFriends() {
		return friends;
	}
	public String toString() {
		String s = getUsername() + ":[";
		for (int i = 0; i < getFriends().size() - 1; i++) {
			s += getFriends().get(i) + ",";
		}
		s += getFriends().get(getFriends().size() - 1) + "], ";
		return s;
	}
}
class SocialNetwork {
	private List<User> users;

	SocialNetwork() {
		users = new List<User>();
	}
	public List<User> getUser() {
		return users;
	}
	public List<String> getConnections(String n) {
		int s = indexOf(n);
		if (s != -1) {
			return users.get(s).getFriends();
			}
			System.out.println("Not a user in Network"); 
			return null;
	}
	public void addUser(User f) {
		users.add(f);
	}

	
	public void addConnection(String n1, String n2) {
		int index = indexOf(n1);
		if (index != -1) {
			List<String> friends = users.get(index).getFriends();
			friends.add(n2);
		}
	}
	public int indexOf(String name) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public List getCommonConnections(String m1, String m2) {
		List<String> s1 = getConnections(m1);
		List<String> s2 = getConnections(m2);
		List<String> store = new List<String>();
		
		if (s1 != null && s2 !=null) {
			for (int i = 0;i<s1.size(); i++) {
				if (s2.contains(s1.get(i))) {
					store.add(s1.get(i));
				}	
			}	
		}
		return store;

}
public String toString() {
		String[] keys = new String[users.size()];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = users.get(i).getUsername();
		}
		Arrays.sort(keys);
		String s = "";
		int i = 0;
		for (i = 0; i < keys.length - 1; i++) {
			s += keys[i] + ": " + getConnections(keys[i]) + ", ";
		}
		s += keys[i] + ": " + getConnections(keys[i]);
		return s;
	}

}
public class Solution {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] input = s.nextLine().split(" ");
	int a = Integer.parseInt(input[1]);
	SocialNetwork user = new SocialNetwork();
	while (a!=0) {
		String[] tokens = s.nextLine().split(" is connected to ");
		/*System.out.println(tokens[0]);*/
		String[] friend = tokens[1].replace(".","").split(", ");
		user.addUser(new User(tokens[0], friend));
		a -= 1;

		}
		while (s.hasNext()) {
			String[] func = s.nextLine().split(" ");
			switch (func[0]) {
				case "addConnections":
				user.addConnection(func[1], func[2]);
				break;
				case "getConnections":
				if (user.getConnections(func[1]) != null) {
					System.out.println(user.getConnections(func[1]));
				}
				break;
				case "CommonConnections":
				System.out.println(user.getCommonConnections(func[1], func[2]));	
				break;
				case "Network":
				System.out.println(user);
				default:
				break;



			}
		}

		}
	}




