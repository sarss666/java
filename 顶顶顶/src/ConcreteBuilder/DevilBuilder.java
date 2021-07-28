package ConcreteBuilder;

import AbstractBuilder.ActorBuilder;
import Product.Actor;

public class DevilBuilder extends ActorBuilder {
	private Actor actor;
    @Override
    public void buildType() {
    	
        
        actor.setType("¶ñÄ§");
    }

    @Override
    public void buildSex() {
        actor.setSex("Ä§");
    }

    @Override
    public void buildFace() {
        actor.setFace("³óÂª");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("ºÚÒÂ");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("¹âÍ·");
    }
}