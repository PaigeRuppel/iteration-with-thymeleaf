package trees;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TreeController {

	private Map<String, TreeType> trees = new HashMap<>();

	public TreeController() {
		TreeType redMaple = new TreeType("Red Maple", "Sapindaceae", "Acer", "saccharum");
		TreeType sycamore = new TreeType("Sycamore", "Platanaceae", "Platanus", "occidentalis");
		TreeType whiteAsh = new TreeType("White Ash", "Oleaceae", "Fraxinus", "americana");
		TreeType whitePine = new TreeType("White Pine", "Pinaceae", "Pinus", "strobus");
		
		trees.put("Red Maple", redMaple);
		trees.put("Sycamore", sycamore);
		trees.put("White Ash", whiteAsh);
		trees.put("White Pine", whitePine);
	}
	
	

	@RequestMapping("/trees")
	public String fetchTrees(Model model) {
		model.addAttribute("treesAsMap", trees);
		model.addAttribute("treesAsCollection", trees.values());
		return "treeIteration";
	}

}
