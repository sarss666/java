package ConcreteBuilder;
import AbstractBuilder.ActorBuilder;
import Product.Actor;

public class HeroBuilder extends ActorBuilder {
	private Actor actor;
	@Override
    public void buildType() {
        actor.setType("Ӣ��");
    }

    @Override
    public void buildSex() {
        actor.setSex("��");
    }

    @Override
    public void buildFace() {
        actor.setFace("Ӣ��");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("����");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("Ʈ��");
    }
}
