// auto-generated stub from '/home/eugen/Git/coffee-editor/backend/examples/SuperBrewer3000/SuperBrewer3000.xmi' at 2019/07/31 16:58:08
package SuperBrewer3000;

import SuperBrewer3000.AbstractBrew;

public class Brew extends AbstractBrew {

	@Override
	public void preExecute() {
		// TODO Add custom implementation here
        System.out.println("PRE BREW");
	}

	@Override
	public void postExecute() {
		// TODO Add custom implementation here
System.out.println("POST BREW");
	}

	@Override
	public String getId() {
		return null;
	}

}
