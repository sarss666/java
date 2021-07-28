package ConcreteBuilder;

import AbstractBuilder.ActorBuilder;
import Product.Actor;

public class DevilBuilder extends ActorBuilder {
	private Actor actor;
    @Override
    public void buildType() {
    	
        
        actor.setType("��ħ");
    }

    @Override
    public void buildSex() {
        actor.setSex("ħ");
    }

    @Override
    public void buildFace() {
        actor.setFace("��ª");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("����");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("��ͷ");
    }
}