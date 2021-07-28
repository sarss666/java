package ConcreteBuilder;

import Product.Actor;
import AbstractBuilder.ActorBuilder;
import Product.Actor;
public class AngelBuilder extends ActorBuilder {
	
	private Actor actor;
    @Override
    public void buildType() {
        actor.setType("��ʹ");
    }

    @Override
    public void buildSex() {
        actor.setSex("Ů");
    }

    @Override
    public void buildFace() {
        actor.setFace("Ư��");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("��ȹ");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("����");
    }
}
